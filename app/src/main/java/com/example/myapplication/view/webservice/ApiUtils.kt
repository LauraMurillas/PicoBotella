package com.example.myapplication.view.webservice

class ApiUtils {
    companion object {
        fun getApiService() : ApiService {
            return RetrofitClient.getRetrofit().create(ApiService::class.java)
        }
    }
}