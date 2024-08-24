package com.hsyncnblk.newsapp.models


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    var author: String?,
    @SerializedName("content")
    var content: Any?,
    @SerializedName("description")
    var description: Any?,
    @SerializedName("publishedAt")
    var publishedAt: String?,
    @SerializedName("source")
    var source: Source?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("url")
    var url: String?,
    @SerializedName("urlToImage")
    var urlToImage: Any?
)