package com.app.supermercado.consulta

import android.app.Application
import android.app.PendingIntent.getActivity
import android.content.res.Resources
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.util.Log
import androidx.core.text.HtmlCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.app.supermercado.MainActivity
import com.app.supermercado.R
import com.app.supermercado.database.Produtos
import com.app.supermercado.database.ProdutosRepositorio
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import java.lang.StringBuilder

class PesquisaProdutoViewModel(application: Application): AndroidViewModel(application) {

    //Job e Scope pra utilizar coroutines
    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)


    //Pra finalizar as coroutines
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    val produtosRepositorio = ProdutosRepositorio()
    val produtos = produtosRepositorio.produtosLista


    fun pesquisa(){
        produtosRepositorio.carregaProduto()


    }

    private val _navigateToProdutoDados = MutableLiveData<Long>()
    val navigateToProdutoDados
        get() = _navigateToProdutoDados

    fun onProdutoClick(id: Long){
        _navigateToProdutoDados.value = id
    }

    fun onProdutoDadosNaviagated(){
        _navigateToProdutoDados.value = null
    }
}
