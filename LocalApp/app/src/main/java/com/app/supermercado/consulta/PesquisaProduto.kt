package com.app.supermercado.consulta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.app.supermercado.R
import com.app.supermercado.databinding.PesquisaProdutoFragmentBinding


class PesquisaProduto : Fragment() {

    lateinit var produtosAdapter: ProdutosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        val binding : PesquisaProdutoFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.pesquisa_produto_fragment, container, false)

        val application = requireNotNull(this.activity).application
        val viewModelFactory = PesquisaProdutoViewModelFactory(application)
        val pesquisaProdutoViewModel =
            ViewModelProvider(this, viewModelFactory).get(PesquisaProdutoViewModel::class.java)


        val adapter = ProdutosAdapter(ProdutoListener {
            idProduto -> pesquisaProdutoViewModel.onProdutoClick(idProduto) })
        binding.listaProduto.adapter = adapter

        //Operacao de Navigacao de PesquisaProdutos para ProdutoDados
        pesquisaProdutoViewModel.navigateToProdutoDados.observe(viewLifecycleOwner, Observer { produto ->
            produto?.let {
                this.findNavController().navigate(
                    PesquisaProdutoDirections.actionPesquisaProdutoToProdutoDetalhes())
                pesquisaProdutoViewModel.onProdutoDadosNaviagated()
            }
        })

        //Observer do LiveData de produtos, que recebe a lista de itens que vão ser exibidos no RecyclerView
        pesquisaProdutoViewModel.produtos.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })

        binding.pesquisaProdutoViewModel = pesquisaProdutoViewModel
        binding.lifecycleOwner = this

        return binding.root
    }


}
