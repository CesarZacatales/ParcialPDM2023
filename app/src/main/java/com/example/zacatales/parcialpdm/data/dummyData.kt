package com.example.zacatales.parcialpdm.data

import com.example.zacatales.parcialpdm.data.model.SupermarketModel

val supermarket1_name = "SuperMart"
val supermarket1_location = "123 Main Street, Cityville"

val supermarket2_name = "MegaGrocery"
val supermarket2_location = "456 Elm Avenue, Townsville"

val supermarket3_name = "QuickBuy"
val supermarket3_location = "789 Oak Lane, Villageland"

var supermarkets = mutableListOf(
    SupermarketModel(supermarket1_name, supermarket1_location),
    SupermarketModel(supermarket2_name, supermarket2_location),
    SupermarketModel(supermarket3_name, supermarket3_location)
)