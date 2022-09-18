package com.akinayhan.week4homework.adapter

import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.databinding.library.baseAdapters.BR
import com.akinayhan.week4homework.model.MarsModel
import com.akinayhan.week4homework.databinding.RecyclerItemBinding
import com.akinayhan.week4homework.ui.HomeFragmentDirections

class MarsViewHolder(
    private val marsDataBinding : ViewDataBinding
) : RecyclerView.ViewHolder(marsDataBinding.root) {
    fun onBind(marsModel: MarsModel) {
        val binding = marsDataBinding as RecyclerItemBinding

        binding.apply {
            setVariable(BR.marsModel,marsModel)

            menuImage.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(HomeFragmentDirections.actionHomeFragmentToProductFragment(marsModel))
            }
        }
    }
}