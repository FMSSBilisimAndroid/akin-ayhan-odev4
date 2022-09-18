package com.akinayhan.week4homework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.akinayhan.week4homework.R
import com.akinayhan.week4homework.databinding.FragmentGetStartedBinding


class GetStartedFragment : Fragment() {

    private lateinit var fragmentGetStartedBinding: FragmentGetStartedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentGetStartedBinding = FragmentGetStartedBinding.inflate(inflater)
        return fragmentGetStartedBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentGetStartedBinding.apply {
            btnGetStarted.setOnClickListener {
                findNavController().navigate(R.id.homeFragment)
            }
        }
    }
}