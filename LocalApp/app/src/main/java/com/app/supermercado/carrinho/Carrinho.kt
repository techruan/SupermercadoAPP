package com.app.supermercado.carrinho

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.supermercado.R

class Carrinho : Fragment() {

    companion object {
        fun newInstance() = Carrinho()
    }

    private lateinit var viewModel: CarrinhoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.carrinho_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CarrinhoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}