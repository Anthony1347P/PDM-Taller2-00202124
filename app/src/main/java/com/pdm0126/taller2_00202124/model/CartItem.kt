package com.pdm0126.taller2_00202124.model

data class CartItem(
    val dish: Dish,
    val restaurantName: String,
    val quantity: Int = 1
)