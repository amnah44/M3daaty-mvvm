package com.graps.m3daaty.ui.search


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.graps.m3daaty.R
import com.graps.m3daaty.databinding.FragmentSearchBinding
import com.graps.m3daaty.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    override val viewModel by activityViewModels<SearchViewModel>()
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean) -> FragmentSearchBinding =
        DataBindingUtil::inflate

    override fun setupView() {
        binding.shimmerLayout.startShimmer()
        binding.shimmerLayout.startShimmer()
        binding.viewModel = viewModel
        binding.searchRecyclerView.adapter = SearchAdapter(mutableListOf(),viewModel)
        binding.shimmerLayout.stopShimmer()
        binding.shimmerLayout.visibility = View.GONE
    }
}