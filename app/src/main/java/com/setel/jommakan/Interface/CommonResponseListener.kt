package com.setel.jommakan.Interface

interface CommonResponseListener {
    fun onSuccessResponse(result: String, from: String, code: Int)
    fun onError(msg: String, fromUrl: String)
}