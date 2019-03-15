package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var categoryAdapter : ArrayAdapter<Category>

    lateinit var categoryAdapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lesson 2 Generic with names
        /*categoryAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)*/

        //Lesson 3 Custom Adapter with own layout
        categoryAdapter = CategoryAdapter(this, DataService.categories)


        categoriesList.adapter = categoryAdapter
    }
}
