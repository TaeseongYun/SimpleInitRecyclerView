package com.tsdev.simpleinitrecycler

import android.util.Log
import android.view.ViewGroup
import com.tsdev.simpleinitrecyclerview.SimpleInitRecyclerViewHolder
import kotlinx.android.synthetic.main.recycler_item.view.*

class ExampleRecyclerViewHolder(parent: ViewGroup) :
    SimpleInitRecyclerViewHolder<ExampleData, ExampleRecyclerAdapterViewModel>(
        parent,
        R.layout.recycler_item
    ) {

    override fun ExampleRecyclerAdapterViewModel.initFunction() {
        itemView.setOnClickListener {
            this.onClickItem(adapterPosition)
        }
    }

    override fun setBinding(item: ExampleData) {
        Log.d("TAG", "함수 호출")
        itemView.tv_age.text = item.age.toString()
        itemView.tv_name.text = item.name
    }
}