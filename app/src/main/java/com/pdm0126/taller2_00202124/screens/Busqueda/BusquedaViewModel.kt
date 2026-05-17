package com.pdm0126.taller2_00202124.screens.Busqueda

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_00202124.data.RepositorioRestaurantesImpl
import com.pdm0126.taller2_00202124.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BusquedaViewModel : ViewModel() {

    private val repositorio = RepositorioRestaurantesImpl()

    private val _todosRestaurantes = MutableStateFlow<List<Restaurant>>(emptyList())

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _resultados = MutableStateFlow<List<Restaurant>>(emptyList())
    val resultados: StateFlow<List<Restaurant>> = _resultados.asStateFlow()

    init {
        viewModelScope.launch {
            _todosRestaurantes.value = repositorio.obtenerRestaurantes()
        }
    }

    fun onQueryChange(nuevoQuery: String) {
        _query.value = nuevoQuery
        filtrar(nuevoQuery)
    }

    private fun filtrar(query: String) {
        if (query.isBlank()) {
            _resultados.value = emptyList()
            return
        }

        _resultados.value = _todosRestaurantes.value.filter { restaurante ->
            restaurante.name.contains(query, ignoreCase = true) ||
                    restaurante.menu.any { it.name.contains(query, ignoreCase = true) }
        }
    }
}