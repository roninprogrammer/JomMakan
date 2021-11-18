package com.setel.jommakan.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.setel.jommakan.Model.Restaurant
import com.setel.jommakan.R
import kotlinx.android.synthetic.main.singlerow_layout_restaurant_details.view.*

class RestaurantAdapter(private val arrList: Array<Restaurant>) : RecyclerView.Adapter<RestaurantAdapter.CustomViewHolder>() {

    override fun getItemCount()=arrList.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater= LayoutInflater.from(parent?.context)
        val cellRow=layoutInflater.inflate(R.layout.singlerow_layout_restaurant_details,parent,false)
        return CustomViewHolder(cellRow)
    }
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int)
    {
        holder.bindItems(arrList[position])
    }

    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        fun bindItems(restaurantModel: Restaurant)
        {
            try {

                itemView.textView_title.text = restaurantModel.restaurants[0]
                itemView.textView_opening.text = restaurantModel.restaurants[0].operatingHours

                itemView.setOnClickListener {
                    Toast.makeText(
                        itemView.context,
                        "Clicked Position $position",
                        Toast.LENGTH_SHORT
                    ).show()
                }


            }catch (e:Exception){
                println(e.message)
            }
        }
}