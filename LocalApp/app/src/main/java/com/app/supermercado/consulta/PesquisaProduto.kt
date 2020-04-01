package com.app.supermercado.consulta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.app.supermercado.R
import com.app.supermercado.databinding.PesquisaProdutoFragmentBinding


class PesquisaProduto : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val binding : PesquisaProdutoFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.pesquisa_produto_fragment, container, false)
        return binding.root
    }

}
