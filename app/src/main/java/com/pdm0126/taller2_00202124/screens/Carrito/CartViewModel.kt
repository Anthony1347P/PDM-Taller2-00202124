package com.pdm0126.taller2_00202124.screens.Carrito

import androidx.lifecycle.ViewModel
import com.pdm0126.taller2_00202124.model.CartItem
import com.pdm0126.taller2_00202124.model.Dish
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CartViewModel : ViewModel() {

    private val _items = MutableStateFlow<List<CartItem>>(emptyList())
    val items: StateFlow<List<CartItem>> = _items.asStateFlow()

    private val _cantidadTotal = MutableStateFlow(0)
    val cantidadTotal: StateFlow<Int> = _cantidadTotal.asStateFlow()

    fun agregar(dish: Dish, restaurantName: String) {
        val actual = _items.value.toMutableList()
        val indice = actual.indexOfFirst { it.dish.id == dish.id }

        if (indice >= 0) {
            val item = actual[indice]
            actual[indice] = item.copy(quantity = item.quantity + 1)
        } else {
            actual.add(CartItem(dish, restaurantName))
        }

        _items.value = actual
        actualizarTotal()
    }

    fun aumentar(dishId: Int) {
        val actual = _items.value.toMutableList()
        val indice = actual.indexOfFirst { it.dish.id == dishId }
        if (indice >= 0) {
            val item = actual[indice]
            actual[indice] = item.copy(quantity = item.quantity + 1)
            _items.value = actual
            actualizarTotal()
        }
    }

    fun disminuir(dishId: Int) {
        val actual = _items.value.toMutableList()
        val indice = actual.indexOfFirst { it.dish.id == dishId }
        if (indice >= 0) {
            val item = actual[indice]
            if (item.quantity > 1) {
                actual[indice] = item.copy(quantity = item.quantity - 1)
            } else {
                actual.removeAt(indice)
            }
            _items.value = actual
            actualizarTotal()
        }
    }

    fun eliminar(dishId: Int) {
        _items.value = _items.value.filter { it.dish.id != dishId }
        actualizarTotal()
    }

    fun vaciar() {
        _items.value = emptyList()
        actualizarTotal()
    }

    private fun actualizarTotal() {
        _cantidadTotal.value = _items.value.sumOf { it.quantity }
    }
}