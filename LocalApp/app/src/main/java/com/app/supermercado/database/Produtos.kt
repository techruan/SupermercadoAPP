package com.app.supermercado.database

data class Produtos(
    var idProduto: Long,
    var nomeProduto: String,
    var precoProduto: Double,
    var estoqueProdutos: String,
    var categoria: String,
    var descricao: String,
    var imagemProduto: String
)