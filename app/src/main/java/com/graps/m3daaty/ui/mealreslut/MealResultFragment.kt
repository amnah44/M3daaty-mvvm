package com.graps.m3daaty.ui.mealreslut

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentMealResultBinding
import com.graps.m3daaty.ui.base.BaseFragment

class MealResultFragment : BaseFragment<FragmentMealResultBinding>(R.layout.fragment_meal_result) {
    override val LOG_TAG: String
        get() = TODO("Not yet implemented")
    override val viewModel by activityViewModels<MealResultViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentMealResultBinding =
        DataBindingUtil :: inflate

    override fun setupView() {

    }

}