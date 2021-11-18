package com.setel.jommakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.setel.jommakan.Adapter.RestaurantAdapter
import com.setel.jommakan.Interface.CommonResponseListener
import com.setel.jommakan.Model.Restaurant
import com.setel.jommakan.Network.NetworkAccessor
import com.setel.jommakan.Network.WebUrls
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity(), CommonResponseListener {
    private lateinit var arrList:Array<Restaurant>
    var gson = Gson()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getListRestaurants()
    }

    private fun getListRestaurants(){
        var networkAccessor= NetworkAccessor()
        var jsoPayload = JSONObject()
        networkAccessor.commonNetworkCall(this@MainActivity,jsoPayload,this@MainActivity,WebUrls.BASE_URL,
            WebUrls.GET_RESTAURANT_LIST)
    }

    override fun onSuccessResponse(result: String, from: String, code: Int) {
        val restaurantListModel = gson.fromJson(result, Array<Restaurant>::class.java)
        arrList = restaurantListModel
        if(arrList.isNotEmpty()){
            setDataToAdapter()
        }

    }

    override fun onError(msg: String, fromUrl: String) {
        println("Error Message:-$msg")
    }

    private fun setDataToAdapter(){
        var linearLayoutManager = LinearLayoutManager(this)
        var adapter = RestaurantAdapter(arrList)
        recyclerview.layoutManager = linearLayoutManager
        recyclerview.adapter = adapter
    }
}