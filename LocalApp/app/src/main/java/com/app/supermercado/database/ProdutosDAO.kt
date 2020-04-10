package com.app.supermercado.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProdutosDAO {

    @Insert
    fun insert(produtos: Produtos)

    @Query("SELECT * FROM produtos_table WHERE nome_produto LIKE :nome ")
    fun get(nome: String) : Produtos

    @Query("DELETE FROM produtos_table")
    fun clearAll()

    @Query("SELECT * FROM produtos_table ORDER BY nome_produto DESC")
    fun getAll(): LiveData<List<Produtos>>

}