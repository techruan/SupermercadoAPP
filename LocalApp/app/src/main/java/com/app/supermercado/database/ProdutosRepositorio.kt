package com.app.supermercado.database

import android.app.PendingIntent.getActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.Response
import android.util.Log
import com.android.volley.toolbox.*



class ProdutosRepositorio {

    //Repositorio para tests

    private val _produtosLista = MutableLiveData<List<Produtos>>()
    val produtosLista: LiveData<List<Produtos>> = _produtosLista

    fun carregaProduto(){
//        val list =  ArrayList<Produtos>()
//        list.add(
//            Produtos(
//                0,
//                "Cadeira",
//                59.99,
//                "Disponivel",
//                "Movel",
//                "cadeira basica",
//                "not found"
//            )
//        )
//        list.add(
//            Produtos(
//                1,
//                "Mesa",
//                59.99,
//                "Disponivel",
//                "Movel",
//                "mesa basica",
//                "not found"
//            )
//        )
//        list.add(
//            Produtos(
//                3,
//                "Pera",
//                9.99,
//                "Disponivel",
//                "Fruta",
//                "pera basica",
//                "not found"
//            )
//        )
//        list.add(
//            Produtos(
//                4,
//                "Banana",
//                9.99,
//                "Disponivel",
//                "Fruta",
//                "banana basica",
//                "not found"
//            )
//        )
//        list.add(
//            Produtos(
//                5,
//                "Carteira",
//                59.99,
//                "Disponivel",
//                "Movel",
//                "carteira basica",
//                "not found"
//            )
//        )
//
//        _produtosLista.value = list
    }
}