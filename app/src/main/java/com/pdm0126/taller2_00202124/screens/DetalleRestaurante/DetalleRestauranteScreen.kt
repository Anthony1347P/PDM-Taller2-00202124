package com.pdm0126.taller2_00202124.screens.DetalleRestaurante

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import coil3.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetalleRestauranteScreen(
    restauranteId: Int,
    onVolver: () -> Unit
) {
    val viewModel: DetalleRestauranteViewModel = viewModel(
        key = restauranteId.toString(),
        factory = viewModelFactory {
            initializer { DetalleRestauranteViewModel(restauranteId) }
        }
    )
    val restaurante by viewModel.restaurante.collectAsStateWithLifecycle()
    val contexto = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurante?.name ?: "Restaurante", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onVolver) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->
        restaurante?.let { r ->
            LazyColumn(
                contentPadding = PaddingValues(
                    top = padding.calculateTopPadding() + 12.dp,
                    bottom = padding.calculateBottomPadding() + 12.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    Text(
                        text = r.description,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
                items(r.menu) { platillo ->
                    Card(shape = RoundedCornerShape(12.dp)) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AsyncImage(
                                model = platillo.imageUrl,
                                contentDescription = platillo.name,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(80.dp)
                                    .clip(RoundedCornerShape(8.dp))
                            )
                            Spacer(Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(platillo.name, fontWeight = FontWeight.Bold)
                                Text(
                                    platillo.description,
                                    style = MaterialTheme.typography.bodySmall,
                                    maxLines = 3
                                )
                                Spacer(Modifier.height(6.dp))
                                Button(
                                    onClick = {
                                        Toast.makeText(
                                            contexto,
                                            "${platillo.name} agregado al carrito",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                ) {
                                    Text("+ Agregar")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}