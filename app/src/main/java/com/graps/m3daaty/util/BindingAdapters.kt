package com.graps.m3daaty.util

import android.view.View
import androidx.databinding.BindingAdapter

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
//@BindingAdapter
//fun onTextChanged(view: View, flag: Boolean){
//    if(flag)
//        view.visibility = View.VISIBLE
//    else
//        view.visibility = View.GONE
//}