package com.example.pizzashop.model

data class PizzaModel(
    val pizzaName: String? = null,
    val basePrice: Int? = null,
    val tomatoSauce: Boolean? = null,
    val cheese: Boolean? = null,
    val peperoni: Boolean? = null,
    val mushroom: Boolean? = null,
    val pineapple: Boolean? = null,
    val beef: Boolean? = null,
    val mutton: Boolean? = null,
    val veg: Boolean? = null,
    val finalPrice: Float? = null
) {

}