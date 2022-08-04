package com.example.pizzashop.model

import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    val pizzaList = mutableListOf<String>("Margherita","Veg", "Pak", "Beef", "Special")


}