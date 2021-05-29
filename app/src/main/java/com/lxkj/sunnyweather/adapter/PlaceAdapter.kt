package com.lxkj.sunnyweather.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.lxkj.sunnyweather.R
import com.lxkj.sunnyweather.login.model.Place
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(private val fr: Fragment, private val placeList: List<Place>) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val placeName: TextView = view.placeName
        val placeAddress: TextView = view.placeAddress
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.placeName.text = placeList[position].name
        holder.placeAddress.text = placeList[position].formatted_address
    }

    override fun getItemCount(): Int = placeList.size


}