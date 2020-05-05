package com.tsdev.simpleinitrecyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class SimpleInitRecyclerAdapter<VIEW_HOLDER_VM : BaseRecyclerNotifyInterface<ITEM>, ITEM>(
    createRepository: (recyclerAdapterData: RecyclerAdapterData<ITEM>) -> VIEW_HOLDER_VM
) :
    RecyclerView.Adapter<SimpleInitRecyclerViewHolder<ITEM, VIEW_HOLDER_VM>>() {

    val adapterRepository: RecyclerAdapterData<ITEM> by lazy {
        AbstractRecyclerAdapterRepository<ITEM>()
    }

    val adapterViewModel: VIEW_HOLDER_VM = createRepository(adapterRepository)

    init {
        adapterViewModel.run {
            notifiedItemChange = this@SimpleInitRecyclerAdapter::notifyDataSetChanged
            notifiedItemChangePosition = this@SimpleInitRecyclerAdapter::notifyItemChanged
            notifiedRangeRemove = this@SimpleInitRecyclerAdapter::notifyItemRangeRemoved
            notifiedRemove = this@SimpleInitRecyclerAdapter::notifyItemRemoved
            notifiedItemInsert = this@SimpleInitRecyclerAdapter::notifyItemInserted
        }
    }


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

