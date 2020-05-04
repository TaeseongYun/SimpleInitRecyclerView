package com.tsdev.simpleinitrecycler

import android.util.Log
import android.view.ViewGroup
import com.tsdev.simpleinitrecyclerview.SimpleInitRecyclerAdapter
import com.tsdev.simpleinitrecyclerview.SimpleInitRecyclerViewHolder

class ExampleRecyclerViewAdapter :
    SimpleInitRecyclerAdapter<ExampleRecyclerAdapterViewModel, ExampleData>(::ExampleRecyclerAdapterViewModel) {

    override fun createViewHolder(
        viewType: Int,
        parent: ViewGroup
    ): SimpleInitRecyclerViewHolder<ExampleData, ExampleRecyclerAdapterViewModel> =
        ExampleRecyclerViewHolder(parent)


    override fun onBindViewHolder(
        holder: SimpleInitRecyclerViewHolder<ExampleData, ExampleRecyclerAdapterViewModel>,
        position: Int
    ) {
        Log.d("TAG", "호출")
        holder.setBinding(adapterRepository.getItem(position))
    }
}