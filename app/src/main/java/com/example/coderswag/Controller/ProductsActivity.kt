package com.example.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.coderswag.Adapter.ProductRecycleAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductRecycleAdapter(this, DataService.getProducts(categoryType))
        productsRecyclerView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation //1 = portrait, 2 = landscape
        val screenSize = resources.configuration.screenWidthDp //xlarge screens start at 720dp

        if(orientation == Configuration.ORIENTATION_PORTRAIT && screenSize > 720){
            spanCount = 3
        }else if(orientation == Configuration.ORIENTATION_LANDSCAPE && screenSize > 720){
            spanCount = 4
        }else if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsRecyclerView.layoutManager = layoutManager

    }
}
