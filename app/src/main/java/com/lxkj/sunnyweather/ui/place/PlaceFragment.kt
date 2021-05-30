package com.lxkj.sunnyweather.ui.place

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lxkj.sunnyweather.R
import com.lxkj.sunnyweather.adapter.PlaceAdapter
import com.lxkj.sunnyweather.common.MainActivity
import com.lxkj.sunnyweather.common.WeatherActivity
import kotlinx.android.synthetic.main.fragment_place.*

//首次选择城市和侧滑切换城市
class PlaceFragment : Fragment() {

    val viewModel by lazy { ViewModelProviders.of(this).get(PlaceViewModel::class.java) }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_place, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val isPlace1 = viewModel.isPlace()
        if (activity is MainActivity && isPlace1) {
            //有保存的地点位置
            val place = viewModel.getPlace()
            val intent = Intent(activity, WeatherActivity::class.java).apply {
                putExtra("placeName", place.name)
                putExtra("placeAddress", place.formatted_address)
                putExtra("lat", place.location.lat)
                putExtra("lng", place.location.lng)
            }
            activity?.startActivity(intent)
            activity?.finish()
            return
        } else {
            //没有保存地点位置
            noPlace()
        }


    }

    private fun noPlace() {
        val linearLayoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = linearLayoutManager
        val adapter = PlaceAdapter(this, viewModel.placeList)
        recyclerView.adapter = adapter

        searchPlaceEdit.addTextChangedListener { aa ->
            val content = aa.toString()
            if (content.isNotEmpty()) {
                //有文字搜索
                viewModel.searchPlaces(content)
            } else {
                //没有文字
                recyclerView.visibility = View.GONE
                bgImageView.visibility = View.VISIBLE
                viewModel.placeList.clear()
                adapter.notifyDataSetChanged()

            }
        }

        viewModel.placeLiveData.observe(this, Observer { result ->
            val place = result.getOrNull()

            if (place != null) {
                recyclerView.visibility = View.VISIBLE
                bgImageView.visibility = View.GONE
                viewModel.placeList.clear()
                viewModel.placeList.addAll(place)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(activity, "没有数据", Toast.LENGTH_LONG).show()
            }


        })
    }


}