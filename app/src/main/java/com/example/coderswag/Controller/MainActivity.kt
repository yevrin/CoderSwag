package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Adapter.CategoryRecycleAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var categoryAdapter : ArrayAdapter<Category>

    //lateinit var categoryAdapter : CategoryAdapter
    lateinit var categoryAdapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lesson 2 Generic with names
        /*categoryAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)*/

        //Lesson 3 Custom Adapter with own layout
        //categoryAdapter = CategoryAdapter(this, DataService.categories)
        categoryAdapter = CategoryRecycleAdapter(this, DataService.categories)


        categoriesRecyclerView.adapter = categoryAdapter
        //categoriesListView.adapter = categoryAdapter

        //DOES NOT WORK FOR RECYCLER VIEW
//        categoriesListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell.", Toast.LENGTH_SHORT).show()
//        }

        val layoutManager = LinearLayoutManager(this)
        categoriesRecyclerView.layoutManager = layoutManager
        categoriesRecyclerView.setHasFixedSize(true) //for better optimization if know not changing size


    }
}
