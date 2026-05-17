package com.pdm0126.taller2_00202124.screens.DetalleRestaurante

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_00202124.data.RepositorioRestaurantesImpl
import com.pdm0126.taller2_00202124.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetalleRestauranteViewModel(
    private val restauranteId: Int
) : ViewModel() {

    private val repositorio = RepositorioRestaurantesImpl()

    private val _restaurante = MutableStateFlow<Restaurant?>(null)
    val restaurante: StateFlow<Restaurant?> = _restaurante.asStateFlow()

    init {
        viewModelScope.launch {
            _restaurante.value = repositorio.obtenerRestaurantePorId(restauranteId)
        }
    }
}