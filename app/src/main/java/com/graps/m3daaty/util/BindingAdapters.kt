package com.graps.m3daaty.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.Coil
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.graps.m3daaty.R

@BindingAdapter(value = ["onTextChanged"])
fun onTextChanged(view: View, flag: Boolean){
    if(flag)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}
@BindingAdapter(value = ["imageUrl"])
fun ImageView.setImageFromUrl(url: String?){
    this.load(url){
        crossfade(true)
        placeholder(R.drawable.ic_image_place_holder)
        transformations(RoundedCornersTransformation())
    }
}