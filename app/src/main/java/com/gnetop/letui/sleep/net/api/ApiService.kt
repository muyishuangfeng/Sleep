package com.gnetop.letui.sleep.net.api

import com.gnetop.letui.sleep.model.UserModel
import retrofit2.http.*

interface ApiService {

    companion object {
        const val BASE_URL = "http://192.168.196.126:8081/"
    }

    /**
     * 登录
     */
    @FormUrlEncoded
    @POST("User/login")
    suspend fun login(
        @Field("user_name") username: String,
        @Field("user_pass") password: String
    ): ApiResult<UserModel>

    /**
     * 注册
     */
    @FormUrlEncoded
    @POST("User/register")
    suspend fun register(
        @Field("user_name") username: String,
        @Field("user_pass") password: String
    ): ApiResult<UserModel>

    /**
     * 更新用户信息
     */
    @FormUrlEncoded
    @POST("/User/update")
    suspend fun update(
        @Field("id") id: Int,
        @Field("user_name") username: String,
        @Field("user_pass") password: String,
        @Field("user_avatar") user_avatar: String
    ): ApiResult<UserModel>




}