package com.tsdev.simpleinitrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class SimpleInitRecyclerViewHolder<ITEM, VIEW_HOLDER_VM : BaseRecyclerNotifyInterface<ITEM>>(
    parent: ViewGroup,
    override val layoutRes: Int
) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(layoutRes, parent, false)
    ), RecyclerViewHolderData<ITEM> {

    /*
        This function use onClickFunction for each other itemView
     */
    abstract fun VIEW_HOLDER_VM.initFunction()

    private lateinit var _adapterViewModel: VIEW_HOLDER_VM

    var adapterViewModel: VIEW_HOLDER_VM
        get() = _adapterViewModel
        set(value) {
            _adapterViewModel = value
            _adapterViewModel.initFunction()
        }
}