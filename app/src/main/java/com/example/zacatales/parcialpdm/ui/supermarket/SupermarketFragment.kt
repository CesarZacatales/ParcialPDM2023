package com.example.zacatales.parcialpdm.ui.supermarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.zacatales.parcialpdm.R
import com.example.zacatales.parcialpdm.databinding.FragmentSupermarketBinding
import com.example.zacatales.parcialpdm.ui.supermarket.list.recyclerview.SupermarketRecyclerViewAdapter
import com.example.zacatales.parcialpdm.ui.supermarket.viewmodel.SupermarketViewModel

class SupermarketFragment : Fragment() {

    private val pokemonViewModel: SupermarketViewModel by activityViewModels {
        SupermarketViewModel.Factory
    }
    private lateinit var binding: FragmentSupermarketBinding

    private lateinit var adapter: SupermarketRecyclerViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSupermarketBinding.inflate(inflater, container, false)
        return binding.root
    }
    private fun setViewModel(){
        binding.nameSupermarket
        binding.viewmodel = pokemonViewModel
    }

}