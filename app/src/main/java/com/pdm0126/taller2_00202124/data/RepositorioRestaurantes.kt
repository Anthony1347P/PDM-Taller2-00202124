package com.pdm0126.taller2_00202124.data

import com.pdm0126.taller2_00202124.model.Restaurant

// Contrato del repositorio: como se exponen los datos al resto de la app
interface RepositorioRestaurantes {
    suspend fun obtenerRestaurantes(): List<Restaurant>
    suspend fun obtenerRestaurantePorId(id: Int): Restaurant?
}