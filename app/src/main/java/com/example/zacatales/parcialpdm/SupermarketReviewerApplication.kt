package com.example.zacatales.parcialpdm

import android.app.Application
import com.example.zacatales.parcialpdm.data.supermarkets
import com.example.zacatales.parcialpdm.repositories.SupermarketRepository

class SupermarketReviewerApplication: Application() {
    val supermarketRepository: SupermarketRepository by lazy {
        SupermarketRepository(supermarkets)
    }
}