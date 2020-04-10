package com.app.supermercado.consulta


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter
import com.app.supermercado.database.Produtos
import com.app.supermercado.databinding.ProdutoItemBinding


class ProdutosAdapter(val clickListener:ProdutoListener) : ListAdapter<Produtos, ProdutosAdapter.ViewHolder>(ProdutoDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder.inflateFrom(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(getItem(position)!!, clickListener)
    }

    //ViewHolder da Lista de Produtos
    class ViewHolder private constructor(val binding: ProdutoItemBinding) : RecyclerView.ViewHolder(binding.root) {

        val imgProduto: ImageView = binding.produtoImg

        //Binder dos dos itens do produto
        fun bind(item: Produtos, clickListener: ProdutoListener) {
            binding.produto = item
            binding.clickListener = clickListener
            binding.executePendingBindings()

        }

        //Inicializador do Layout
        companion object {
            fun inflateFrom(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ProdutoItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class ProdutoDiffCallback : DiffUtil.ItemCallback<Produtos>() {
    override fun areItemsTheSame(oldItem: Produtos, newItem: Produtos): Boolean {
        return oldItem.idProduto == newItem.idProduto

    }

    override fun areContentsTheSame(oldItem: Produtos, newItem: Produtos): Boolean {
        return oldItem == newItem

    }
}

class ProdutoListener(val clickListener: (idProduto: Long) -> Unit){
    fun onClick(produtos: Produtos) = clickListener(produtos.idProduto)
}
