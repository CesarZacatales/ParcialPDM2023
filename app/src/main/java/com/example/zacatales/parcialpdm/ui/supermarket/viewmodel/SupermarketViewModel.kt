package com.example.zacatales.parcialpdm.ui.supermarket.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.zacatales.parcialpdm.SupermarketReviewerApplication
import com.example.zacatales.parcialpdm.data.model.SupermarketModel
import com.example.zacatales.parcialpdm.data.supermarkets
import com.example.zacatales.parcialpdm.repositories.SupermarketRepository

class SupermarketViewModel(private val repository: SupermarketRepository) : ViewModel() {
    var name = MutableLiveData(" ")
    var ubication = MutableLiveData(" ")
    var status = MutableLiveData(" ")

    fun getSupermarkets() = repository.getSupermarkets()

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as SupermarketReviewerApplication
                SupermarketViewModel(app.supermarketRepository)
            }
        }
        const val POKEMON_CREATE = "Supermarket created"
        const val WRONG_INFORMATION = "wrong information"
        const val INACTIVE = ""
    }

    fun createSupermarket(){
        if(!validateData()){
            status.value = WRONG_INFORMATION
            return
        }
        val supermarket = SupermarketModel(
            name.value !!,
            ubication.value!!,
        )
        addSupermarkets(supermarket)
        clearData()

        status.value = POKEMON_CREATE
    }

    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            ubication.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun clearData() {
        name.value = ""
        ubication.value = ""
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    fun setSelectedSupermarket(supermarket: SupermarketModel){
        name.value = supermarket.name
        ubication.value = supermarket.ubication

    }

    fun addSupermarkets(supermarket: SupermarketModel) = repository.addSupermarkets(supermarket)

}