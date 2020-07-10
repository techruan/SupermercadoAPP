package com.app.supermercado.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.app.supermercado.R
import com.app.supermercado.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var viewModel: MenuFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMenuBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_menu, container, false)

        // Usando ViewModelFactory
        // val viewModel = ViewModelProvider(this, YourViewModelFactory).get(YourViewModel::class.java)
        viewModel = ViewModelProvider(this).get(MenuFragmentViewModel::class.java)

        binding.pesquisarBt.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_pesquisaProduto)
        )

        binding.loginBt.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_menuFragment_to_telaLogin)
        )
        return binding.root
    }

}
