package com.hsyncnblk.newsapp.repository

import com.hsyncnblk.newsapp.api.RetrofitInstance
import com.hsyncnblk.newsapp.db.ArticleDatabase
import com.hsyncnblk.newsapp.models.Article

class NewsRepository(val db : ArticleDatabase) {

    suspend fun getHeadlines(countryCode:String , pageNumber:Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery:String , pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article)= db.getArticleDao().upsert(article)

    fun getFavoriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}