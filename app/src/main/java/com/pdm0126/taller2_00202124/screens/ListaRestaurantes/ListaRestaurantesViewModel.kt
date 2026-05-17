package com.pdm0126.taller2_00202124.screens.ListaRestaurantes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_00202124.data.RepositorioRestaurantesImpl
import com.pdm0126.taller2_00202124.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ListaRestaurantesViewModel : ViewModel() {

    private val repositorio = RepositorioRestaurantesImpl()

    private val _restaurantes = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurantes: StateFlow<List<Restaurant>> = _restaurantes.asStateFlow()

    private val _porCategoria = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val porCategoria: StateFlow<Map<String, List<Restaurant>>> = _porCategoria.asStateFlow()

    init {
        viewModelScope.launch {
            val lista = repositorio.obtenerRestaurantes()
            _restaurantes.value = lista

            _porCategoria.value = lista
                .flatMap { r -> r.categories.map { cat -> cat to r } }
                .groupBy({ it.first }, { it.second })
        }
    }
}