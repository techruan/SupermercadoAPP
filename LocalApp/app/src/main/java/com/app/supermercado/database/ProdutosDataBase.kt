package com.app.supermercado.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Entities = Tables no DB, versão tem q atualizar caso mude, exportSchema cria um arquivo na pasta
@Database(entities = [Produtos::class], version = 1, exportSchema = false)
abstract class ProdutosDataBase : RoomDatabase(){

    abstract val produtosDAO: ProdutosDAO

    companion object{

        // Cria uma instancia do DB
        @Volatile
        private var INSTANCE: ProdutosDataBase? = null

        fun getInstance(context: Context) : ProdutosDataBase {
            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext, ProdutosDataBase::class.java,
                        "produtos_database")
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}