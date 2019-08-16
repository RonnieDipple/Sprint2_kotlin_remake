package com.lambda.shoppinglist


data class GroceryItems(val itemName: String,
                        val itemIconID: Int,
                   var isAddedToList: Boolean = false)