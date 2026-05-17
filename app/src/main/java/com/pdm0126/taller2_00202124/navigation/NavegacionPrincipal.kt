package com.pdm0126.taller2_00202124.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.taller2_00202124.screens.Busqueda.BusquedaScreen
import com.pdm0126.taller2_00202124.screens.DetalleRestaurante.DetalleRestauranteScreen
import com.pdm0126.taller2_00202124.screens.ListaRestaurantes.ListaRestaurantesScreen

@Composable
fun NavegacionPrincipal() {
    val backStack = rememberNavBackStack(Ruta.ListaRestaurantes)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Ruta.ListaRestaurantes> {
                ListaRestaurantesScreen(
                    onRestauranteClick = { id ->
                        backStack.add(Ruta.DetalleRestaurante(id))
                    },
                    onBusquedaClick = {
                        backStack.add(Ruta.Busqueda)
                    }
                )
            }

            entry<Ruta.DetalleRestaurante> { ruta ->
                DetalleRestauranteScreen(
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
        }
    )
}