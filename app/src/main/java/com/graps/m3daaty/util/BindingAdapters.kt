package com.graps.m3daaty.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter
fun onTextChanged(view: View, flag: Boolean){
    if(flag)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}


@BindingAdapter(value = ["imageUrl"])
fun ImageView.seImageFromUrl(url: String?) {
    Glide.with(this)
        .load(url)
        .into(this)
}

@BindingAdapter(value = ["foodCost"])
fun TextView.setText(isCheap: Boolean?) {
    if(isCheap == true){
        this.text="Cheap"
    }
    else{
        this.text="Expensive"
    }
}