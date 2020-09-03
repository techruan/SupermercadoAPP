package com.app.supermercado.consulta

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.app.supermercado.database.Produtos
import kotlinx.android.synthetic.main.produto_item.view.*

/*
Essa Classe serve para fazer o binding dos itens utilizando o BindingAdapter
 */

@BindingAdapter("nomeProduto")
fun TextView.setProdutoNome(item: Produtos?){
    item?.let {
        text = item.nomeProduto.toString()
    }
}

@BindingAdapter("precoProduto")
fun TextView.setProdutoPreco(item: Produtos?){
    item?.let {
        text = item.precoProduto.toString()
    }
}

@BindingAdapter("imgProduto")
fun ImageView.setProdutoImg(item: Produtos?){
    item?.let {

    }
}