package com.tsdev.simpleinitrecycler

import android.view.ViewGroup
import com.tsdev.simpleinitrecyclerview.SimpleInitRecyclerViewHolder

class ExampleRecyclerViewHolder(override val layoutRes: Int, parent: ViewGroup) :
    SimpleInitRecyclerViewHolder<ExampleData, ExampleRecyclerAdapterViewModel>(parent, layoutRes) {

}