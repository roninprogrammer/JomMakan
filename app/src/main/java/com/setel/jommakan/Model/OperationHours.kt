package com.setel.jommakan.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OperationHours (
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("operatingHours")
    @Expose
    var operatingHours: String? = null,
)