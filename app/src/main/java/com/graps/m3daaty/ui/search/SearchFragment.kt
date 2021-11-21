package com.graps.m3daaty.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentSearchBinding
import com.graps.m3daaty.model.domain.recipeSearch.Result
import com.graps.m3daaty.ui.base.BaseFragment
import com.graps.m3daaty.ui.home.HomeFragmentDirections
import com.graps.m3daaty.util.EventObserve

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    override val viewModel by activityViewModels<SearchViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentSearchBinding =
        DataBindingUtil::inflate

    override fun setupView() {
        binding.let {
            it.viewModel = viewModel
            it.searchRecyclerView.adapter = SearchAdapter(mutableListOf(),viewModel)
        }
        viewModel.results.observe(this,EventObserve { result ->
            val action = SearchFragmentDirections.actionSearchFragmentToDetailsFragment(null,result)
            Navigation.findNavController(requireView()).navigate(action)
        })
    }
}