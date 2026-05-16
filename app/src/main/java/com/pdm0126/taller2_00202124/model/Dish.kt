package com.pdm0126.taller2_00202124.model

// Modelo de un platillo del menu
data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)