package com.pdm0126.taller2_00202124.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.taller2_00202124.screens.Busqueda.BusquedaScreen
import com.pdm0126.taller2_00202124.screens.Carrito.CarritoScreen
import com.pdm0126.taller2_00202124.screens.Carrito.CartViewModel
import com.pdm0126.taller2_00202124.screens.DetalleRestaurante.DetalleRestauranteScreen
import com.pdm0126.taller2_00202124.screens.ListaRestaurantes.ListaRestaurantesScreen

@Composable
fun NavegacionPrincipal() {
    val backStack = rememberNavBackStack(Ruta.ListaRestaurantes)
    val cartViewModel: CartViewModel = viewModel()

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Ruta.ListaRestaurantes> {
                ListaRestaurantesScreen(
                    cartViewModel = cartViewModel,
                    onRestauranteClick = { id ->
                        backStack.add(Ruta.DetalleRestaurante(id))
                    },
                    onBusquedaClick = {
                        backStack.add(Ruta.Busqueda)
                    },
                    onCarritoClick = {
                        backStack.add(Ruta.Carrito)
                    }
                )
            }

            entry<Ruta.DetalleRestaurante> { ruta ->
                DetalleRestauranteScreen(
                    cartViewModel = cartViewModel,
                    restauranteId = ruta.restauranteId,
                    onVolver = { backStack.removeLastOrNull() }
                )
            }

            entry<Ruta.Busqueda> {
                BusquedaScreen(
                    onRestauranteClick = { id ->
                        backStack.add(Ruta.DetalleRestaurante(id))
                    },
                    onVolver = { backStack.removeLastOrNull() }
                )
            }

            entry<Ruta.Carrito> {
                CarritoScreen(
                    cartViewModel = cartViewModel,
                    onVolver = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}