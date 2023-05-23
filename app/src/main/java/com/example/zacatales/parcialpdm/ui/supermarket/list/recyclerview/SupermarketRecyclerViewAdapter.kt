package com.example.zacatales.parcialpdm.ui.supermarket.list.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zacatales.parcialpdm.data.model.SupermarketModel
import com.example.zacatales.parcialpdm.databinding.SupermarketItemBinding

class SupermarketRecyclerViewAdapter( private  val clickListener: (SupermarketModel) -> Unit): RecyclerView.Adapter<SupermarketRecyclerViewHolder>(){
    private val supermarkets = ArrayList<SupermarketModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupermarketRecyclerViewHolder {
        val binding = SupermarketItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SupermarketRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SupermarketRecyclerViewHolder, position: Int) {
        val pokemon = supermarkets[position]
        holder.bin(pokemon, clickListener)
    }

    override fun getItemCount(): Int {
        return supermarkets.size
    }

    fun setData(pokemonList: List<SupermarketModel>){
        supermarkets.clear()
        supermarkets.addAll(pokemonList)
    }
}