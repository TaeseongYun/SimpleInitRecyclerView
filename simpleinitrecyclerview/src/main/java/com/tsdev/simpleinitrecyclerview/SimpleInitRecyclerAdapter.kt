package com.tsdev.simpleinitrecyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class SimpleInitRecyclerAdapter<VIEW_HOLDER_VM : RecyclerAdapterData<ITEM>, ITEM>(
    createRepository: (recyclerAdapterData: RecyclerAdapterData<*>) -> VIEW_HOLDER_VM
) :
    RecyclerView.Adapter<SimpleInitRecyclerViewHolder<ITEM, VIEW_HOLDER_VM>>() {

    private val adapterRepository: RecyclerAdapterData<*> by lazy {
        RecyclerAdapterRepository()
    }

    val adapterViewModel: VIEW_HOLDER_VM = createRepository(adapterRepository)

    override fun getItemCount(): Int = adapterRepository.itemCount

    abstract fun createViewHolder(
        viewType: Int,
        parent: ViewGroup
    ): SimpleInitRecyclerViewHolder<ITEM, VIEW_HOLDER_VM>

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SimpleInitRecyclerViewHolder<ITEM, VIEW_HOLDER_VM> =
        createViewHolder(viewType, parent).also {
            it.adapterViewModel = adapterViewModel
        }
}

