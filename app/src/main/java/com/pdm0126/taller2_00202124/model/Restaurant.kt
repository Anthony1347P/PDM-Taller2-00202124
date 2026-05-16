package com.pdm0126.taller2_00202124.model

// Modelo de un restaurante con sus categorias y menu
data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)
