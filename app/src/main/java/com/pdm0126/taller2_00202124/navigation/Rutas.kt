package com.pdm0126.taller2_00202124.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Ruta : NavKey {
    @Serializable
    data object ListaRestaurantes : Ruta()

    @Serializable
    data class DetalleRestaurante(val restauranteId: Int) : Ruta()

    @Serializable
    data object Busqueda : Ruta()

    @Serializable
    data object Carrito : Ruta()
}