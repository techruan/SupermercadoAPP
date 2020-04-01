package com.app.supermercado.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "produtos_table")
data class Produtos(
    @PrimaryKey(autoGenerate = true)
    var idProduto: Long = 0L,

    @ColumnInfo(name = "nome_produto")
    var nomeProduto: String = "",

    @ColumnInfo(name = "preco_produto")
    var precoProduto: Double = 0.0,

    @ColumnInfo(name = "estoque_produto")
    var estoqueProdutos: String = ""

)