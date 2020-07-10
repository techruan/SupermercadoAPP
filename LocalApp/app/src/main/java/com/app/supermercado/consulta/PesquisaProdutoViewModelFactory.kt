package com.app.supermercado.consulta

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class PesquisaProdutoViewModelFactory(
    private val application: Application): ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PesquisaProdutoViewModel::class.java)){
            return PesquisaProdutoViewModel(application) as T
        }
        throw IllegalArgumentException("Class de Viewmodel Desconhecida")

    }

}