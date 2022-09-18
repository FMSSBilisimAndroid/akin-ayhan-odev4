package com.akinayhan.week4homework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.akinayhan.week4homework.R

import com.akinayhan.week4homework.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    private lateinit var fragmentProductBinding: FragmentProductBinding
    private val navArgs : ProductFragmentArgs? by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentProductBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_product,container,false)
        return fragmentProductBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataTransfer()
    }

    private fun dataTransfer(){
        navArgs?.let{ list ->
            fragmentProductBinding.marsList = list.marsModel
        }
    }
}