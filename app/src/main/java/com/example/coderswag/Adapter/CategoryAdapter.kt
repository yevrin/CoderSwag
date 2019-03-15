package com.example.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(context:Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories =  categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val categoryView : View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        //THIS IS BAD IMPLEMENTATION -- VERY COMPUTING HEAVY
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImg)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryTxt)

        val category = categories[position]
        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceID)
        categoryName.text = category.title


        return categoryView
    }

    override fun getItem(position: Int): Any {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 0
        //Makes a unique id for each row
    }

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return categories.count()
    }

}