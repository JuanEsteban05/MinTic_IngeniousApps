package com.example.sitiosturisticos.data

import com.example.sitiosturisticos.model.Poi
import retrofit2.http.GET

interface ApiService {

    @GET("JuanEsteban05/MinTic_IngeniousApps/poi")
    suspend fun getPoi(): Poi
}