package com.tsdev.simpleinitrecyclerview

abstract class BaseRecyclerNotifyInterface<ITEM>(val recyclerAdapterData: RecyclerAdapterData<ITEM>) {
    lateinit var notifiedItemChange: () -> Unit

    lateinit var notifiedItemChangePosition: (position: Int) -> Unit

    lateinit var notifiedRemove: (position: Int) -> Unit

    lateinit var notifiedRangeRemove: (first: Int, second: Int) -> Unit
}