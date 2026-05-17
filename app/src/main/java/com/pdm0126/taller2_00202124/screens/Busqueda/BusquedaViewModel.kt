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

    private val _historial = MutableStateFlow<List<String>>(emptyList())
    val historial: StateFlow<List<String>> = _historial.asStateFlow()

    init {
        viewModelScope.launch {
            _todosRestaurantes.value = repositorio.obtenerRestaurantes()
        }
    }

    fun onQueryChange(nuevoQuery: String) {
        _query.value = nuevoQuery
        filtrar(nuevoQuery)
    }

    fun guardarEnHistorial(query: String) {
        if (query.isBlank()) return
        val actual = _historial.value.toMutableList()
        actual.remove(query)
        actual.add(0, query)
        _historial.value = actual.take(5)
    }

    fun usarQueryDelHistorial(query: String) {
        _query.value = query
        filtrar(query)
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