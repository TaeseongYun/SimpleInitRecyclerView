package com.tsdev.simpleinitrecycler

import com.tsdev.simpleinitrecyclerview.RecyclerAdapterData
import com.tsdev.simpleinitrecyclerview.BaseRecyclerNotifyInterface

class ExampleRecyclerAdapterViewModel(recyclerData: RecyclerAdapterData<ExampleData>) :
    BaseRecyclerNotifyInterface<ExampleData>(recyclerData) {


    lateinit var testOnClick: (adapterPosition: Int, item: ExampleData) -> Unit

    fun onClickItem(adapterPosition: Int) {
        recyclerAdapterData.getItem(adapterPosition).cast<ExampleData>().run {
            testOnClick(adapterPosition, this)
        }
    }
}