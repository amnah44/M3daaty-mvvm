package com.graps.m3daaty.ui.base

import androidx.recyclerview.widget.DiffUtil

class FoodDiffUtils <T>(private val foodOldList: List<T>, private val foodNewList: List<T>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = foodOldList.size

    override fun getNewListSize() = foodNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        foodOldList[oldItemPosition] == foodNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}