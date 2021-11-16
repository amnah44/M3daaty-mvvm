package com.graps.m3daaty.ui.details

import com.graps.m3daaty.ui.base.BaseInteractionListener

interface IngredientsInteractionListener:BaseInteractionListener{
    fun onClickIngredient(ingredientsText:String)
}

interface DirectionInteractionListener:BaseInteractionListener{
    fun onClickDirection(DirectionText:String)
}