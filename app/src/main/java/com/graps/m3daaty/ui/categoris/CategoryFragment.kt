package com.graps.m3daaty.ui.categoris

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentCategoryBinding
import com.graps.m3daaty.ui.base.BaseFragment

class CategoryFragment : BaseFragment<FragmentCategoryBinding>(R.layout.fragment_category) {
    override val LOG_TAG: String
        get() = TODO("Not yet implemented")
    override val viewModel by activityViewModels<CategoryViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentCategoryBinding =
        DataBindingUtil::inflate

    override fun setupView() {

    }

}