package com.graps.m3daaty.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.graps.m3daaty.BR

abstract class BaseFragment<VDB : ViewDataBinding>(private val fragmentLayoutId: Int) : Fragment() {

    protected abstract val LOG_TAG: String
    abstract val viewModel: BaseViewModel

    private lateinit var _binding: VDB
    val binding: VDB get() = _binding
    abstract val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> VDB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater(inflater, fragmentLayoutId, container, false)
        _binding.setVariable(BR.viewModel, viewModel)
        _binding.lifecycleOwner = this
        return binding.root
    }

    //test
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setupView()
    }

    abstract fun setupView()

    protected fun log(value: Any) {
        Log.v(LOG_TAG, value.toString())
    }
}