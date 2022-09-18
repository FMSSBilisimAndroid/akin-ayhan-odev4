package com.akinayhan.week4homework.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.databinding.library.baseAdapters.BR
import com.akinayhan.week4homework.adapter.MarsAdapter
import com.akinayhan.week4homework.databinding.FragmentHomeBinding
import com.akinayhan.week4homework.model.MarsModel
import com.akinayhan.week4homework.network.MarsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {

    private lateinit var fragmentHomeBinding: FragmentHomeBinding
    private var marsList = ArrayList<MarsModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fillList()
    }

    private fun fillList(){
        MarsApi.retrofitService.getProperties().enqueue(object : Callback<ArrayList<MarsModel>> {
            override fun onResponse(call: Call<ArrayList<MarsModel>>, response: Response<ArrayList<MarsModel>>) {
                response.body()?.let { responseList ->
                    marsList = ArrayList(responseList)
                    val marsAdapter = MarsAdapter(ArrayList(responseList))

                    val gridLayoutManager = GridLayoutManager(context,2)
                    fragmentHomeBinding.apply {
                        recyclerView.layoutManager = gridLayoutManager
                        setVariable(BR.adapter, marsAdapter)
                    }
                }
            }
            override fun onFailure(call: Call<ArrayList<MarsModel>>, t: Throwable) {
                Log.e("TEST",t.message.toString())
            }
        })
    }
}