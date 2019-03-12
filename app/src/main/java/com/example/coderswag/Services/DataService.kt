package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(Category("HAT", "hatimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage"))

    val hats = listOf(Product("Devslopes Hat Graphic Beanie", "hat01", 18.00 ),
        Product("Devslopes Hat Black", "hat02", 20.00),
        Product("Devslopes Hat White", "hat03", 20.00),
        Product("Devslopes Hat Snapback", "hat04", 22.00))

    val shirts = listOf(Product("Devslopes Shirt Black", "shirt01", 18.00 ),
        Product("Devslopes Badge Light Gray", "shirt02", 20.00),
        Product("Devslopes Logo Shirt Red", "shirt03", 22.00),
        Product("Devslopes Hustle", "shirt04", 22.00),
        Product("Kickflip Studios Shirt ", "shirt05", 20.00))

    val hoodies = listOf(Product("Devslopes Hoodie Gray", "hoodie01", 28.00 ),
        Product("Devslopes Hoodie Red", "hoodie02", 32.00),
        Product("Devslopes Hoodie Black", "hoodie03", 30.00),
        Product("Devslopes Hoodie White", "hoodie04", 30.00))

    val digitalGoods = listOf(Product("", "digitalgoodsimage",25.00 ))
}