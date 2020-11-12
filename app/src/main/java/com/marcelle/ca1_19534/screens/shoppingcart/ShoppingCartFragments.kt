package com.marcelle.ca1_19534.screens.shoppingcart

import androidx.fragment.app.Fragment

class ShoppingCartFragments : Fragment() {

    private lateinit var viewModel: ShoppingViewModel

    //Tea name
    private var tea = ""

    //Tea`s price
    private var price = 0

    //List of products available
    private lateinit var teaList: MutableList<String>

}