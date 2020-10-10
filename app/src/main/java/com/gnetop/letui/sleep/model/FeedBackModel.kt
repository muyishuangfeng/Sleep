package com.gnetop.letui.sleep.model

data class FeedBackModel(
    var content: String = "",
    var phone: String = "",
    var mList: MutableList<FeedBackImgModel>
)

data class FeedBackImgModel(var imgUrl: String = "", var imgName: String = "")