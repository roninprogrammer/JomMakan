package com.setel.jommakan.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Restaurant (
    @SerializedName("restaurants")
    @Expose
    var restaurants: List<OperationHours>? = null
)