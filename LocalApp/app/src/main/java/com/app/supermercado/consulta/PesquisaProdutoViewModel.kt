package com.app.supermercado.consulta

import android.app.Application
import android.content.res.Resources
import android.os.Build
import android.text.Html
import android.text.Spanned
import androidx.core.text.HtmlCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
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

    //função pra formatar os produtos
    private fun formatProdutos(produtos: List<Produtos>, resources: Resources):Spanned {
        val sb = StringBuilder()
        sb.apply {
            append(resources.getString(R.string.app_name))
            produtos.forEach{
                append("<br>")

            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            return Html.fromHtml(sb.toString(), Html.FROM_HTML_MODE_LEGACY)
        } else {
            return HtmlCompat.fromHtml(sb.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY)
        }
    }

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
