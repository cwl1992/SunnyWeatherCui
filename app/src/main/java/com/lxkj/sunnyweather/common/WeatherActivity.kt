package com.lxkj.sunnyweather.common

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.lxkj.sunnyweather.R
import com.lxkj.sunnyweather.login.Repository.refreshWeather
import com.lxkj.sunnyweather.login.model.Weather
import com.lxkj.sunnyweather.login.model.getSky
import com.lxkj.sunnyweather.ui.weather.WeatherViewModel
import kotlinx.android.synthetic.main.forecast.*
import kotlinx.android.synthetic.main.item_forecast.view.*
import kotlinx.android.synthetic.main.life_index.*
import kotlinx.android.synthetic.main.now.*
import kotlinx.android.synthetic.main.weather_activity.*
import java.text.SimpleDateFormat
import java.util.*

//天气详情
class WeatherActivity : AppCompatActivity() {


    val viewModel by lazy { ViewModelProviders.of(this).get(WeatherViewModel::class.java) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //处理沉浸式图片
        val decorView = window.decorView
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window.statusBarColor = Color.TRANSPARENT

        setContentView(R.layout.weather_activity)

        if (viewModel.locationLng.isEmpty()) {
            viewModel.locationLng = intent.getStringExtra("lng") ?: ""
        }
        if (viewModel.locationLat.isEmpty()) {
            viewModel.locationLat = intent.getStringExtra("lat") ?: ""
        }
        if (viewModel.placeName.isEmpty()) {
            viewModel.placeName = intent.getStringExtra("placeName") ?: ""
        }


        val placeNameStr = intent.getStringExtra("placeName");
        val placeAddress = intent.getStringExtra("placeAddress");
        val lat = intent.getStringExtra("lat");
        val lng = intent.getStringExtra("lng");

        //输出的信息洛阳师范学院=========中国 河南省 洛阳市 洛龙区=========34.630638=========112.604785

        Log.i("TAG", "onCreate: 输出的信息$placeNameStr=========$placeAddress=========$lat=========$lng")


        viewModel.weatherLiveData.observe(this, Observer { result ->
            val weather = result.getOrNull();
            if (weather != null) {
                //处理展示天气信息
                showWeatherInfo(placeNameStr, weather)
            } else {
                //没有数据
                Toast.makeText(this, "查询天气信息失败", Toast.LENGTH_LONG).show()
            }

            swipeRefreshLayout.isRefreshing = false //隐藏刷新按钮的操作

        })

        swipeRefreshLayout.setColorSchemeResources(R.color.purple_500, R.color.tv_red, R.color.yellow)//设置刷新的颜色

        refreshWeatherMethod(viewModel.locationLat, viewModel.locationLng, viewModel.placeName)//默认的请求接口

        swipeRefreshLayout.setOnRefreshListener {
            refreshWeatherMethod(viewModel.locationLat, viewModel.locationLng, viewModel.placeName)//下拉刷新的监听
        }

        Log.d("TAG", "onCreate: " + viewModel.locationLat + "-------" + viewModel.locationLng)


        //从左侧开启侧滑菜单
        backImage.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}

            override fun onDrawerOpened(drawerView: View) {}

            override fun onDrawerClosed(drawerView: View) {
                val manager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                manager.hideSoftInputFromWindow(drawerView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
            }

            override fun onDrawerStateChanged(newState: Int) {}

        })


    }

    fun refreshWeatherMethod(lat: String, lng: String, name: String) {

        Log.d("输出的信息----请求的接口是", "refreshWeatherMethod: $lat----------$lng-------------$name")

        viewModel.refreshWeather(lat, lng)
        swipeRefreshLayout.isRefreshing = true //显示刷新按钮

    }


    private fun showWeatherInfo(placeNameStr: String?, weather: Weather) {

        //--------头部信息-------
        //placeName.text = placeNameStr//城市名字
        placeName.text = viewModel.placeName
        val realtime = weather.realtime
        tv0.text = "${realtime.temperature}℃"//实时温度
        tv1.text = getSky(realtime.skycon).info
        tv2.text = "空气质量 ${realtime.airQuality.aqi.chn.toInt()}"
        nowLayout.setBackgroundResource(getSky(realtime.skycon).bg)
        //--------内容布局信息-------
        forecastLayout.removeAllViews()
        val daily = weather.daily
        val sizeList = daily.skycon.size

        for (i in 0 until sizeList) {
            val skycon = daily.skycon[i]
            val temperature = daily.temperature[i]
            val view = LayoutInflater.from(this).inflate(R.layout.item_forecast, forecastLayout, false)

            val dataInfo: TextView = view.dataInfo
            val imageInfo: ImageView = view.imageInfo
            val skyInfo: TextView = view.skyInfo
            val tempInfo: TextView = view.tempInfo


            val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            dataInfo.text = simpleDateFormat.format(skycon.date)//日期
            skyInfo.text = getSky(skycon.value).info//天气
            tempInfo.text = "${temperature.min}-${temperature.max}℃" //温度
            imageInfo.setImageResource(getSky(skycon.value).icon)//图标

            forecastLayout.addView(view)


        }


        //----------生活指数部分-----------
        val lifeIndex = daily.lifeIndex
        liveTv1.text = lifeIndex.coldRisk.get(0).desc//感冒
        liveTv2.text = lifeIndex.dressing.get(0).desc//穿衣
        liveTv3.text = lifeIndex.ultraviolet.get(0).desc//紫外线
        liveTv4.text = lifeIndex.carWashing.get(0).desc//洗车


    }


}