package com.pdm0126.taller2_00202124.data

import com.pdm0126.taller2_00202124.model.Dish
import com.pdm0126.taller2_00202124.model.Restaurant

class RepositorioRestaurantesImpl : RepositorioRestaurantes {

    private val restaurantes = listOf(
        Restaurant(
            id = 1,
            name = "El Rinconsito UCA",
            description = "El clasico de la UCA con hamburguesas, burritos y tortas, comida mexicana",
            imageUrl = "https://images.unsplash.com/photo-1656956175736-5b4e303755b4?w=600&q=80",
            categories = listOf("Comida Mexicana", "Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 101,
                    name = "Hamburguesa Clasica",
                    description = "Carne de res, queso, lechuga, tomate y salsa de la casa - \$2.75",
                    imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&q=80"
                ),
                Dish(
                    id = 102,
                    name = "Burrito Mixto",
                    description = "Burrito grande con carne, frijoles, arroz, queso y guacamole - \$3.00",
                    imageUrl = "https://images.unsplash.com/photo-1584031036380-3fb6f2d51880?w=400&q=80"
                ),
                Dish(
                    id = 103,
                    name = "Quesadilla de Pollo",
                    description = "Tortilla de harina con pollo desmenuzado y queso fundido - \$2.50",
                    imageUrl = "https://images.unsplash.com/photo-1628838233717-be047a0b54fb?w=400&q=80"
                ),
                Dish(
                    id = 104,
                    name = "Torta Mexicana",
                    description = "Pan telera con milanesa, aguacate, frijoles y jalapenos - \$3.25",
                    imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 2,
            name = "Tortas La China 2006",
            description = "Solo tortas, pero las mejores tortas mexicanas que vas a probar",
            imageUrl = "https://images.unsplash.com/photo-1668854815550-dbad8b0563bb?w=400&q=80",
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(
                    id = 201,
                    name = "Torta Normal",
                    description = "Torta clasica con una porcion de carne, lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$2.00",
                    imageUrl = "https://images.unsplash.com/photo-1702119614788-bae35a7be313?w=400&q=80"
                ),
                Dish(
                    id = 202,
                    name = "Torta Doble Carne",
                    description = "Doble porcion de carne con lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$2.50",
                    imageUrl = "https://images.unsplash.com/photo-1702119614788-bae35a7be313?w=400&q=80"
                ),
                Dish(
                    id = 203,
                    name = "Torta Triple Carne",
                    description = "Triple porcion de carne con lechuga preparada, queso derretido cebolla aguacate, aderezos y chile - \$3.50",
                    imageUrl = "https://images.unsplash.com/photo-1702119614788-bae35a7be313?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 3,
            name = "Asador Urbano",
            description = "Carnes y pollo a la parrilla con sazon urbano y precio accesible",
            imageUrl = "https://images.unsplash.com/photo-1504564321107-4aa3efddb5bd?w=600&q=80",
            categories = listOf("Comida Salvadorena", "Pollo"),
            menu = listOf(
                Dish(
                    id = 301,
                    name = "Plato de Carne Asada",
                    description = "Carne asada al carbon con tortillas, frijoles y chimol - \$3.50",
                    imageUrl = "https://images.unsplash.com/photo-1660847426303-0b7c2486bd17?w=400&q=80"
                ),
                Dish(
                    id = 302,
                    name = "Plato de Pollo Asado",
                    description = "Cuarto de pollo asado con arroz, ensalada y tortillas - \$3.50",
                    imageUrl = "https://images.unsplash.com/photo-1532636875304-0c89119d9b4d?w=400&q=80"
                ),
                Dish(
                    id = 303,
                    name = "Combo Mixto",
                    description = "Porcion generosa de carne y pollo con guarniciones tipicas - \$4.50",
                    imageUrl = "https://images.unsplash.com/photo-1567932783552-e305bbf70b63?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 4,
            name = "Comedor La Pea",
            description = "Almuerzos caseros salvadorenos con sabor de hogar a un precio justo",
            imageUrl = "https://images.unsplash.com/photo-1731603147854-26637afafdea?w=600&q=80",
            categories = listOf("Comida Salvadorena"),
            menu = listOf(
                Dish(
                    id = 401,
                    name = "Pollo Encebollado",
                    description = "Pollo guisado con cebolla, acompanado de arroz y frijoles parados - \$3.25",
                    imageUrl = "https://images.unsplash.com/photo-1598103442097-8b74394b95c6?w=400&q=80"
                ),
                Dish(
                    id = 402,
                    name = "Carne Guisada",
                    description = "Carne en salsa de tomate con arroz blanco y casamiento - \$3.25",
                    imageUrl = "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?w=400&q=80"
                ),
                Dish(
                    id = 403,
                    name = "Lasana (pollo/carne)",
                    description = "Lasagna casera con pollo o carne molida, salsa de tomate y mucho queso - \$3.25",
                    imageUrl = "https://images.unsplash.com/photo-1611270629569-8b357cb88da9?w=400&q=80"
                ),
                Dish(
                    id = 404,
                    name = "Chilaquiles con queso",
                    description = "Chilaquiles de papa en salsa verde con pollo deshebrado y crema - \$3.25",
                    imageUrl = "https://images.unsplash.com/photo-1633372363856-f2fe2669a26e?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 5,
            name = "Cafeteria UCA",
            description = "La cafeteria de la UCA con almuerzos balanceados y opciones variadas",
            imageUrl = "https://images.unsplash.com/photo-1606836576983-8b458e75221d?w=600&q=80",
            categories = listOf("Comida Salvadorena"),
            menu = listOf(
                Dish(
                    id = 501,
                    name = "Sandwich Especial",
                    description = "Sandwich de pollo a la plancha con vegetales frescos y papitas - \$3.50",
                    imageUrl = "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400&q=80"
                ),
                Dish(
                    id = 502,
                    name = "Almuerzo del Dia",
                    description = "Plato variado con proteina y vegetales del dia - \$4.50",
                    imageUrl = "https://images.unsplash.com/photo-1650330151304-5db3ca9b3b6c?w=400&q=80"
                ),
                Dish(
                    id = 503,
                    name = "Ensalada con Pollo",
                    description = "Ensalada y pollo a la plancha - \$4.00",
                    imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400&q=80"
                ),
                Dish(
                    id = 504,
                    name = "Pasta del dia",
                    description = "Pasta del dia preparada con ingredientes frescos - \$5.00",
                    imageUrl = "https://images.unsplash.com/photo-1551183053-bf91a1d81141?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 6,
            name = "Papa John's",
            description = "Mejores ingredientes, mejor pizza. La promesa de Papa John's en cada bocado",
            imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=600&q=80",
            categories = listOf("Pizza"),
            menu = listOf(
                Dish(
                    id = 601,
                    name = "Pizza Pepperoni Mediana",
                    description = "Pizza con extra de pepperoni y mozzarella derretida - \$9.99",
                    imageUrl = "https://images.unsplash.com/photo-1544982503-9f984c14501a?w=400&q=80"
                ),
                Dish(
                    id = 602,
                    name = "Pizza The Works",
                    description = "Cargada con pepperoni, salchicha, jamon, cebolla, pimiento y aceitunas - \$12.99",
                    imageUrl = "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=400&q=80"
                ),
                Dish(
                    id = 603,
                    name = "Pizza Hawaiana",
                    description = "Pizza con jamon, pina y queso mozzarella sobre salsa de tomate - \$10.99",
                    imageUrl = "https://images.unsplash.com/photo-1562835155-a7c2a225e97d?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 7,
            name = "Burger King",
            description = "Hamburguesas flameadas a la parrilla. Como tu las quieras",
            imageUrl = "https://images.unsplash.com/photo-1715616861229-d0696df846fa?w=600&q=80",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 701,
                    name = "Whopper",
                    description = "Hamburguesa flameada con lechuga, tomate, cebolla, pepinillos y mayonesa - \$4.99",
                    imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400&q=80"
                ),
                Dish(
                    id = 702,
                    name = "Hamburguesa Doble",
                    description = "Doble porcion de carne a la parrilla con doble queso americano - \$5.99",
                    imageUrl = "https://images.unsplash.com/photo-1572802419224-296b0aeee0d9?w=400&q=80"
                ),
                Dish(
                    id = 703,
                    name = "Combo Nuggets",
                    description = "Ocho nuggets de pollo con papas medianas y refresco - \$4.50",
                    imageUrl = "https://images.unsplash.com/photo-1518779578993-ec3579fee39f?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 8,
            name = "Pizza Hut",
            description = "La pizza original con masa esponjosa y queso derretido como debe ser",
            imageUrl = "https://images.unsplash.com/photo-1584190926897-0023f6aa05f9?w=600&q=80",
            categories = listOf("Pizza"),
            menu = listOf(
                Dish(
                    id = 801,
                    name = "Pizza Suprema",
                    description = "Pizza con pepperoni, salchicha, hongos, cebolla y pimiento - \$11.99",
                    imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=400&q=80"
                ),
                Dish(
                    id = 802,
                    name = "Pizza Stuffed Crust",
                    description = "Pizza con queso relleno en la orilla y toppings clasicos - \$13.99",
                    imageUrl = "https://images.unsplash.com/photo-1588014164218-d9ecba01aaff?w=400&q=80"
                ),
                Dish(
                    id = 803,
                    name = "Pasta Bolonesa",
                    description = "Pasta con salsa de carne y queso parmesano fresco - \$7.99",
                    imageUrl = "https://images.unsplash.com/photo-1551183053-bf91a1d81141?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 9,
            name = "Pollo Campero",
            description = "El sabor del pollo salvadoreno reconocido a nivel mundial",
            imageUrl = "https://images.unsplash.com/photo-1580217593608-61931cefc821?w=600&q=80",
            categories = listOf("Pollo"),
            menu = listOf(
                Dish(
                    id = 901,
                    name = "Combo Pollo Frito",
                    description = "Dos piezas de pollo campero con papas, ensalada y refresco - \$5.99",
                    imageUrl = "https://images.unsplash.com/photo-1518779578993-ec3579fee39f?w=400&q=80"
                ),
                Dish(
                    id = 902,
                    name = "Familiar 12 Piezas",
                    description = "Ocho piezas de pollo frito para compartir en familia - \$13.99",
                    imageUrl = "https://images.unsplash.com/photo-1513639776629-7b61b0ac49cb?w=400&q=80"
                ),
                Dish(
                    id = 903,
                    name = "Combo para pareja",
                    description = "6 piezas de Pollo crujiente  - \$6.50",
                    imageUrl = "https://images.unsplash.com/photo-1580217593608-61931cefc821?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 10,
            name = "Wendy's",
            description = "Carne fresca, nunca congelada. Calidad Wendy's en cada hamburguesa",
            imageUrl = "https://images.unsplash.com/photo-1683855539569-9c4566a5cbe5?w=600&q=80",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1001,
                    name = "Baconator",
                    description = "Doble carne, seis tiras de bacon, doble queso americano y mayonesa - \$6.99",
                    imageUrl = "https://images.unsplash.com/photo-1561758033-f8ff74d6494a?w=400&q=80"
                ),
                Dish(
                    id = 1002,
                    name = "Spicy Chicken Sandwich",
                    description = "Sandwich de pollo crujiente con salsa picante, lechuga y mayonesa - \$5.49",
                    imageUrl = "https://images.unsplash.com/photo-1692737348416-0a4fa4cf1523?w=400&q=80"
                ),
                Dish(
                    id = 1003,
                    name = "Frosty de Chocolate",
                    description = "El postre helado clasico de Wendy's en sabor chocolate - \$2.50",
                    imageUrl = "https://images.unsplash.com/photo-1653085315536-1379bc836161?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 11,
            name = "McDonald's",
            description = "Me encanta. La cadena de comida rapida mas grande del mundo",
            imageUrl = "https://images.unsplash.com/photo-1606720335177-3d04e70fb13b?w=600&q=80",
            categories = listOf("Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 1101,
                    name = "Big Mac Combo",
                    description = "Big Mac con papas medianas y refresco a eleccion - \$5.99",
                    imageUrl = "https://images.unsplash.com/photo-1551782450-a2132b4ba21d?w=400&q=80"
                ),
                Dish(
                    id = 1102,
                    name = "McNuggets 10 Piezas",
                    description = "Diez nuggets de pollo crujiente con tres salsas a eleccion - \$5.49",
                    imageUrl = "https://images.unsplash.com/photo-1518779578993-ec3579fee39f?w=400&q=80"
                ),
                Dish(
                    id = 1103,
                    name = "McFlurry Oreo",
                    description = "Helado cremoso de vainilla con trozos de galleta Oreo - \$3.00",
                    imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400&q=80"
                )
            )
        ),
        Restaurant(
            id = 12,
            name = "KFC",
            description = "El pollo frito original con la receta secreta de 11 hierbas y especias",
            imageUrl = "https://images.unsplash.com/photo-1513639776629-7b61b0ac49cb?w=600&q=80",
            categories = listOf("Pollo"),
            menu = listOf(
                Dish(
                    id = 1201,
                    name = "Bucket 8 Piezas",
                    description = "Ocho piezas de pollo con la receta original del Coronel - \$14.99",
                    imageUrl = "https://images.unsplash.com/photo-1513639776629-7b61b0ac49cb?w=400&q=80"
                ),
                Dish(
                    id = 1202,
                    name = "Twister de Pollo",
                    description = "Wrap con tiras de pollo crispy, lechuga y salsa especial - \$4.99",
                    imageUrl = "https://images.unsplash.com/photo-1571331421405-51b8feea1033?w=400&q=80"
                ),
                Dish(
                    id = 1203,
                    name = "Combo Crispy",
                    description = "Tres piezas de pollo crispy con papas y bebida mediana - \$6.50",
                    imageUrl = "https://images.unsplash.com/photo-1580217593608-61931cefc821?w=400&q=80"
                )
            )
        )
    )

    override suspend fun obtenerRestaurantes(): List<Restaurant> = restaurantes

    override suspend fun obtenerRestaurantePorId(id: Int): Restaurant? =
        restaurantes.find { it.id == id }
}