package com.example.lab7_api


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface PostAPIService {
    @GET("posts")
    suspend fun listPosts(): List<Post>

    @POST("posts")
    suspend fun makePost(
        @Body post: Post
    ): Response<ResponseBody>

    @DELETE("posts")
    suspend fun deletePost(
            @Query("id") id: String
    ): Response<ResponseBody>
}