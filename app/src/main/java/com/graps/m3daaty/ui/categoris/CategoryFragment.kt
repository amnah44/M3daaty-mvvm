package com.graps.m3daaty.ui.categoris

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.DiffUtil
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentCategoryBinding
import com.graps.m3daaty.model.domain.recipeSearch.RecipeSearch
import com.graps.m3daaty.ui.base.BaseFragment
import com.graps.m3daaty.util.CuisineList

class CategoryFragment : BaseFragment<FragmentCategoryBinding>(R.layout.fragment_category) {
    override val viewModel: CategoryViewModel
        get() = CategoryViewModel()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentCategoryBinding
        get() = DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it. viewModel = viewModel
            it.recyclerCuisine.adapter = CategoryAdapter(mutableListOf(), viewModel)

        }
    }

}