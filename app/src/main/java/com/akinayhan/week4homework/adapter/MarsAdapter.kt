package com.akinayhan.week4homework.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.akinayhan.week4homework.R
import com.akinayhan.week4homework.model.MarsModel

class MarsAdapter (private val marsList: ArrayList<MarsModel>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val marsBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.recycler_item,parent,false)
        return MarsViewHolder(marsBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MarsViewHolder).onBind(marsList[position])
    }

    override fun getItemCount(): Int {
        return marsList.size
    }
}