package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("ACCESSORIES", "accessoriesimage"))

    val shirts = listOf(Product("The Whispered One Skull T-Shirt", "shirt01", 25.00 ),
        Product("Critical Role Sleeveless Keyfish V-Neck", "shirt02", 25.00),
        Product("Pumat Sol\'s The Invulnerable Vagrant T-Shirt", "shirt03", 25.00),
        Product("Critical Role Retro Ringer T-Shirt", "shirt04", 25.00),
        Product("Nott The Best Detective Agency T-Shirt", "shirt05", 25.00),
        Product("Critical Role Might Nein T-Shirt", "shirt05", 25.00))

    val hoodies = listOf(Product("How Do You Want To Do This? Hoodie", "hoodies01",65.00 ))

    val hats = listOf(Product("Critical Role Logo Hat Navy", "hat01", 25.00 ),
        Product("Critical Role \'Do You Spice?\' Cap", "hat02", 18.00),
        Product("Critical Role Logo Hat Gray", "hat03", 25.00),
        Product("Critical Role Beanie", "hat04", 20.00))

    val accessories = listOf(Product("Critical Role Wildmount Dice Set", "accessories01", 20.00 ),
        Product("Critical Role Might Nein Enamel Pin", "accessories02", 12.00),
        Product("Critical Role Vox Machina Pin", "accessories03", 10.00),
        Product("Critical Role Traveller Bumper Sticker", "accessories04", 5.00),
        Product("Critical Role Tusk Love Notebook", "accessories05", 12.00))

    val emptyDefault = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        when(category){
            "SHIRTS"-> return shirts
            "HOODIES"-> return hoodies
            "HATS"-> return hats
            "ACCESSORIES"-> return accessories
            else -> return emptyDefault
        }
    }
}