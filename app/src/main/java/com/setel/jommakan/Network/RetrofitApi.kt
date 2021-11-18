package com.setel.jommakan.Network

import com.google.gson.JsonElement
import retrofit2.Call
import retrofit2.http.GET


interface RetrofitApi{
    @GET(WebUrls.GET_RESTAURANT_LIST)
    fun getListRestaurant(): Call<JsonElement>
}