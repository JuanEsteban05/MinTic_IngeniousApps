package com.example.sitiosturisticos.data

class PoiRepository {
    suspend fun getPoi()= ApiFactory.retrofit.getPoi()
}