package com.app.supermercado

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.app.supermercado.database.Produtos
import com.app.supermercado.database.ProdutosDAO
import com.app.supermercado.database.ProdutosDataBase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException


@RunWith(AndroidJUnit4::class)
class DBTest {

    private lateinit var produtosDao: ProdutosDAO
    private lateinit var db: ProdutosDataBase

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        // Using an in-memory database because the information stored here disappears when the
        // process is killed.
        db = Room.inMemoryDatabaseBuilder(context, ProdutosDataBase::class.java)
            // Allowing main thread queries, just for testing.
            .allowMainThreadQueries()
            .build()
        produtosDao = db.produtosDAO
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetNight() {
        val produtos = Produtos()
        produtosDao.insert(produtos)
        val produto = produtosDao.get("nome")

    }
}

