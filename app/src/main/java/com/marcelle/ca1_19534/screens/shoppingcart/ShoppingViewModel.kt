package com.marcelle.ca1_19534.screens.shoppingcart

import android.util.Log
import androidx.lifecycle.ViewModel

class ShoppingViewModel : ViewModel() {

    //Tea Name
    var tea = ""

    //Tea price
    var price = ""

    //List of tea available
    private lateinit var teaList: MutableList<String>

    private fun resetList() {
        teaList = mutableListOf(
            "Darjelling - 8.50 per 100 gram bag",
            "Assam - 7.50 per 100 gram bag",
            "Lapsang - Sous 9.5 per 100 gram bag",
            "Earl Grey - 3.5 per 100 gram bag",
            "Irish Breakfast - 2.5 per 100 gram bag"
        )
    }

    init {
        Log.i("ShoppingViewModel", "ShoppingViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ShoppingViewModel", "ShoppinhViewModel destroyed!")
    }

}