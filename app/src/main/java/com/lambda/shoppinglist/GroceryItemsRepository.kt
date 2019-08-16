package com.lambda.shoppinglist

import com.lambda.shoppinglist.ShoppingItemConstants.ICON_IDS
import com.lambda.shoppinglist.ShoppingItemConstants.ITEM_NAMES_RAW

class GroceryItemsRepository {

    companion object {
        val groceryList = mutableListOf<GroceryItems>()

        fun createGroceryList(){
            for (i in 0 until groceryList.size){
                groceryList.add(GroceryItems(ITEM_NAMES_RAW[i], ICON_IDS[i], false))

            }
        }

    }
}