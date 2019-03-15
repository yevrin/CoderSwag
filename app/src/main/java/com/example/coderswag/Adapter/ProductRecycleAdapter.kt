package com.example.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import java.text.FieldPosition

class ProductRecycleAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductRecycleAdapter.ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
        //return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return  products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImg)
        val productName = itemView?.findViewById<TextView>(R.id.productNameTxt)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPriceTxt)

        fun bindProduct(product : Product, context: Context){
            val resourceID = context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productImage?.setImageResource(resourceID)
            productName?.text = product.title
            productPrice?.text = "$" + String.format("%.2f", product.price)

            //, val itemClick: (Product) -> Unit //itemView.setOnClickListener{itemClick(product)}
        }
    }
}