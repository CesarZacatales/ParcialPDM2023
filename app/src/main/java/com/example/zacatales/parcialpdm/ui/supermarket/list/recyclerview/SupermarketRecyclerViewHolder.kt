package com.example.zacatales.parcialpdm.ui.supermarket.list.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.zacatales.parcialpdm.data.model.SupermarketModel
import com.example.zacatales.parcialpdm.databinding.SupermarketItemBinding

class SupermarketRecyclerViewHolder(private val binding: SupermarketItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bin(supermarket: SupermarketModel, clickListener: (SupermarketModel) -> Unit){
        binding.textNameSupermarket.text = supermarket.name
        binding.textUbication.text = supermarket.ubication

        binding.pokemonItemCard.setOnClickListener{
            clickListener(supermarket)
        }
    }
}