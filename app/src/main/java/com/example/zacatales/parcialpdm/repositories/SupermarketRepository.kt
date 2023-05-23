package com.example.zacatales.parcialpdm.repositories

import com.example.zacatales.parcialpdm.data.model.SupermarketModel

class SupermarketRepository(private val supermarkets: MutableList<SupermarketModel>) {

    fun getSupermarkets() = supermarkets

    fun addSupermarkets(supermarket: SupermarketModel) = supermarkets.add(0, supermarket)
}