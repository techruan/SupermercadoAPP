package com.app.supermercado.consulta

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.supermercado.database.ProdutosDAO
import java.lang.IllegalArgumentException

class PesquisaProdutoViewModelFactory(
    private val dataSource: ProdutosDAO,
    private val application: Application): ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PesquisaProdutoViewModel::class.java)){
            return PesquisaProdutoViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Class de Viewmodel Desconhecida")

    }

}