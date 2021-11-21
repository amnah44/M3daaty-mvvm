package com.graps.m3daaty.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentHomeBinding
import com.graps.m3daaty.ui.base.BaseFragment
import com.graps.m3daaty.util.EventObserve

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    override val viewModel by activityViewModels<HomeViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentHomeBinding =
        DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it.viewModel = viewModel
            it.homeRecyclerView.adapter = RandomRecipesAdapter(mutableListOf(), viewModel)
            it.recommendedRecycler.adapter = RecommendedRecipeAdapter(mutableListOf(), viewModel)
        }
        viewModel.recipes.observe(this, EventObserve {
            val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(it,null)
            Navigation.findNavController(requireView()).navigate(action)
        })
    }
}