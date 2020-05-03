package com.tsdev.simpleinitrecyclerview

interface RecyclerAdapterData<ITEM> {
    val adapterItem: MutableList<ITEM>

    fun getItem(position: Int): ITEM

    fun addItems(items: List<ITEM>)

    fun addItem(item: ITEM)

    fun clear()

    fun removeItem(position: Int)

    val itemCount: Int
}