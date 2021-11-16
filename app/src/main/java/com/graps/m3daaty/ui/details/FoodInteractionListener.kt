package com.graps.m3daaty.ui.details

import com.graps.m3daaty.ui.base.BaseInteractionListener

interface IngredientsAndDirectionInteractionListener:BaseInteractionListener{
    fun onClickIngredient(ingredientsText:String)
    fun onClickDirection(DirectionText:String)
}
