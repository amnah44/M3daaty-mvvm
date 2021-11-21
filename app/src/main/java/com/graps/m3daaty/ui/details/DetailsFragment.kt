package com.graps.m3daaty.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentDetailsBinding
import com.graps.m3daaty.ui.base.BaseFragment

class DetailsFragment : BaseFragment<FragmentDetailsBinding>(R.layout.fragment_details) {
    override val viewModel by activityViewModels<FoodDetailsViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentDetailsBinding =
        DataBindingUtil::inflate
    private val args: DetailsFragmentArgs by navArgs()

    override fun setupView() {
        val food = args.details
        food.let { food.id?.let { it1 -> viewModel.getRecipesDetails(it1) } }
    }
}