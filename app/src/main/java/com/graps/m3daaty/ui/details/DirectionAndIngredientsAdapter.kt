package com.graps.m3daaty.ui.details

import com.graps.m3daaty.R
import com.graps.m3daaty.ui.base.BaseAdapter
import com.graps.m3daaty.ui.base.BaseInteractionListener

class IngredientsAdapter(
    items: List<String>, listener: IngredientsAndDirectionInteractionListener
): BaseAdapter<String>(items, listener) {
    override val layoutId: Int = R.layout.item_ingredients
}

class DirectionAdapter(
    items: List<String>, listener: IngredientsAndDirectionInteractionListener
): BaseAdapter<String>(items, listener) {
    override val layoutId: Int = R.layout.item_ingredients
}
