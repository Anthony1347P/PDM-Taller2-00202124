package com.pdm0126.taller2_00202124.data

import com.pdm0126.taller2_00202124.model.Dish
import com.pdm0126.taller2_00202124.model.Restaurant

class RepositorioRestaurantesImpl : RepositorioRestaurantes {

    private val restaurantes = listOf(
        Restaurant(
            id = 1,
            name = "El Rinconsito UCA",
            description = "El clasico de la UCA con hamburguesas, burritos y tortas, comida mexicana",
            imageUrl = "",
            categories = listOf("Comida Mexicana", "Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 101,
                    name = "Hamburguesa Clasica",
                    description = "Carne de res, queso, lechuga, tomate y salsa de la casa - \$2.75",
                    imageUrl = ""
                ),
                Dish(
                    id = 102,
                    name = "Burrito Mixto",
                    description = "Burrito grande con carne, frijoles, arroz, queso y guacamole - \$3.00",
                    imageUrl = ""
                ),
                Dish(
                    id = 103,
                    name = "Quesadilla de Pollo",
                    description = "Tortilla de harina con pollo desmenuzado y queso fundido - \$2.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 104,
                    name = "Torta Mexicana",
                    description = "Pan telera con milanesa, aguacate, frijoles y jalapenos - \$3.25",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 2,
            name = "Tortas La China 2006",
            description = "Solo tortas, pero las mejores tortas mexicanas que vas a probar",
            imageUrl = "",
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(
                    id = 201,
                    name = "Torta Normal",
                    description = "Torta clasica con una porcion de carne, lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$2.00",
                    imageUrl = ""
                ),
                Dish(
                    id = 202,
                    name = "Torta Doble Carne",
                    description = "Doble porcion de carne con lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$2.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 203,
                    name = "Torta Triple Carne",
                    description = "Triple porcion de carne con lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$3.50",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 3,
            name = "Asador Urbano",
            description = "Carnes y pollo a la parrilla con sazon urbano y precio accesible",
            imageUrl = "",
            categories = listOf("Comida Salvadorena", "Pollo"),
            menu = listOf(
                Dish(
                    id = 301,
                    name = "Plato de Carne Asada",
                    description = "Carne asada al carbon con tortillas, frijoles y chimol - \$3.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 302,
                    name = "Plato de Pollo Asado",
                    description = "Cuarto de pollo asado con arroz, ensalada y tortillas - \$3.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 303,
                    name = "Combo Mixto",
                    description = "Porcion generosa de carne y pollo con guarniciones tipicas - \$4.50",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 4,
            name = "Comedor La Pea",
            description = "Almuerzos caseros salvadorenos con sabor de hogar a un precio justo",
            imageUrl = "",
            categories = listOf("Comida Salvadorena"),
            menu = listOf(
                Dish(
                    id = 401,
                    name = "Pollo Encebollado",
                    description = "Pollo guisado con cebolla, acompanado de arroz y frijoles parados - \$3.25",
                    imageUrl = ""
                ),
                Dish(
                    id = 402,
                    name = "Carne Guisada",
                    description = "Carne en salsa de tomate con arroz blanco y casamiento - \$3.25",
                    imageUrl = ""
                ),
                Dish(
                    id = 403,
                    name = "Lasana (pollo/carne)",
                    description = "Lasagna casera con pollo o carne molida, salsa de tomate y mucho queso - \$3.25",
                    imageUrl = ""
                ),
                Dish(
                    id = 404,
                    name = "Chilaquiles con queso",
                    description = "Chilaquiles de papa en salsa verde con pollo deshebrado y crema - \$3.25",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 5,
            name = "Cafeteria UCA",
            description = "La cafeteria de la UCA con almuerzos balanceados y opciones variadas",
            imageUrl = "",
            categories = listOf("Comida Salvadorena"),
            menu = listOf(
                Dish(
                    id = 501,
                    name = "Sandwich Especial",
                    description = "Sandwich de pollo a la plancha con vegetales frescos y papitas - \$3.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 502,
                    name = "Almuerzo del Dia",
                    description = "Plato variado con proteina y vegetales del dia - \$4.50",
                    imageUrl = ""
                ),
                Dish(
                    id = 503,
                    name = "Ensalada con Pollo",
                    description = "Ensalada y pollo a la plancha - \$4.00",
                    imageUrl = ""
                ),
                Dish(
                    id = 504,
                    name = "Pasta del dia",
                    description = "Pasta del dia preparada con ingredientes frescos - \$5.00",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 6,
            name = "Papa John's",
            description = "Mejores ingredientes, mejor pizza. La promesa de Papa John's en cada bocado",
            imageUrl = "",
            categories = listOf("Pizza"),
            menu = listOf(
                Dish(
                    id = 601,
                    name = "Pizza Pepperoni Mediana",
                    description = "Pizza con extra de pepperoni y mozzarella derretida - \$9.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 602,
                    name = "Pizza The Works",
                    description = "Cargada con pepperoni, salchicha, jamon, cebolla, pimiento y aceitunas - \$12.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 603,
                    name = "Pizza Hawaiana",
                    description = "Pizza con jamon, pina y queso mozzarella sobre salsa de tomate - \$10.99",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 7,
            name = "Burger King",
            description = "Hamburguesas flameadas a la parrilla. Como tu las quieras",
            imageUrl = "",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 701,
                    name = "Whopper",
                    description = "Hamburguesa flameada con lechuga, tomate, cebolla, pepinillos y mayonesa - \$4.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 702,
                    name = "Hamburguesa Doble",
                    description = "Doble porcion de carne a la parrilla con doble queso americano - \$5.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 703,
                    name = "Combo Nuggets",
                    description = "Ocho nuggets de pollo con papas medianas y refresco - \$4.50",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 8,
            name = "Pizza Hut",
            description = "La pizza original con masa esponjosa y queso derretido como debe ser",
            imageUrl = "",
            categories = listOf("Pizza"),
            menu = listOf(
                Dish(
                    id = 801,
                    name = "Pizza Suprema",
                    description = "Pizza con pepperoni, salchicha, hongos, cebolla y pimiento - \$11.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 802,
                    name = "Pizza Stuffed Crust",
                    description = "Pizza con queso relleno en la orilla y toppings clasicos - \$13.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 803,
                    name = "Pasta Bolonesa",
                    description = "Pasta con salsa de carne y queso parmesano fresco - \$7.99",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 9,
            name = "Pollo Campero",
            description = "El sabor del pollo salvadoreno reconocido a nivel mundial",
            imageUrl = "",
            categories = listOf("Pollo"),
            menu = listOf(
                Dish(
                    id = 901,
                    name = "Combo Pollo Frito",
                    description = "Dos piezas de pollo campero con papas, ensalada y refresco - \$5.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 902,
                    name = "Familiar 12 Piezas",
                    description = "Ocho piezas de pollo frito para compartir en familia - \$13.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 903,
                    name = "Combo para pareja",
                    description = "6 piezas de Pollo crujiente  - \$6.50",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 10,
            name = "Wendy's",
            description = "Carne fresca, nunca congelada. Calidad Wendy's en cada hamburguesa",
            imageUrl = "",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1001,
                    name = "Baconator",
                    description = "Doble carne, seis tiras de bacon, doble queso americano y mayonesa - \$6.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 1002,
                    name = "Spicy Chicken Sandwich",
                    description = "Sandwich de pollo crujiente con salsa picante, lechuga y mayonesa - \$5.49",
                    imageUrl = ""
                ),
                Dish(
                    id = 1003,
                    name = "Frosty de Chocolate",
                    description = "El postre helado clasico de Wendy's en sabor chocolate - \$2.50",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 11,
            name = "McDonald's",
            description = "Me encanta. La cadena de comida rapida mas grande del mundo",
            imageUrl = "",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1101,
                    name = "Big Mac Combo",
                    description = "Big Mac con papas medianas y refresco a eleccion - \$5.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 1102,
                    name = "McNuggets 10 Piezas",
                    description = "Diez nuggets de pollo crujiente con tres salsas a eleccion - \$5.49",
                    imageUrl = ""
                ),
                Dish(
                    id = 1103,
                    name = "McFlurry Oreo",
                    description = "Helado cremoso de vainilla con trozos de galleta Oreo - \$3.00",
                    imageUrl = ""
                )
            )
        ),
        Restaurant(
            id = 12,
            name = "KFC",
            description = "El pollo frito original con la receta secreta de 11 hierbas y especias",
            imageUrl = "",
            categories = listOf("Pollo"),
            menu = listOf(
                Dish(
                    id = 1201,
                    name = "Bucket 8 Piezas",
                    description = "Ocho piezas de pollo con la receta original del Coronel - \$14.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 1202,
                    name = "Twister de Pollo",
                    description = "Wrap con tiras de pollo crispy, lechuga y salsa especial - \$4.99",
                    imageUrl = ""
                ),
                Dish(
                    id = 1203,
                    name = "Combo Crispy",
                    description = "Tres piezas de pollo crispy con papas y bebida mediana - \$6.50",
                    imageUrl = ""
                )
            )
        )
    )

    override suspend fun obtenerRestaurantes(): List<Restaurant> = restaurantes

    override suspend fun obtenerRestaurantePorId(id: Int): Restaurant? =
        restaurantes.find { it.id == id }
}