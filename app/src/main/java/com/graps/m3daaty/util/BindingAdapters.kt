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
@BindingAdapter(value = ["app:showOnLoading"])
fun <T> showOnLoading(view: View, state: State<T>?) {
    if (state is State.Loading)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}

@BindingAdapter(value = ["app:showOnError"])
fun <T> showOnError(view: View, state: State<T>?) {
    if (state is State.Error)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}

@BindingAdapter(value = ["app:showOnSuccess"])
fun <T> showOnSuccess(view: View, state: State<T>?) {
    if (state is State.Success)
        view.visibility = View.VISIBLE
    else
        view.visibility = View.GONE
}