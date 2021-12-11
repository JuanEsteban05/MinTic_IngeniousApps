package com.example.sitiosturisticos.lista

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sitiosturisticos.data.PoiRepository
import com.example.sitiosturisticos.model.Poi
import com.example.sitiosturisticos.model.PoiItem
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.InputStream

class ListViewModel : ViewModel() {

    private var sitiosLoad : MutableLiveData<ArrayList<PoiItem>> = MutableLiveData()
    val onSitiosLoaded : LiveData<ArrayList<PoiItem>> = sitiosLoad

    private val repository = PoiRepository()

    fun getPoiFromServer() {
        GlobalScope.launch(Dispatchers.IO) {
            sitiosLoad.postValue(repository.getPoi())
        }
    }

    fun loadMockLugaresFromJson(lugaresString: InputStream?) {

        val lugaresString = lugaresString?.bufferedReader().use{it!!.readText()}
        val gson = Gson()
        sitiosLoad.value= gson.fromJson(lugaresString, Poi::class.java)

    }
}