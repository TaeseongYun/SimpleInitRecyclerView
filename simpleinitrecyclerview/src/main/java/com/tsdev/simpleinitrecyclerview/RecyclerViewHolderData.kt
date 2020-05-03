package com.tsdev.simpleinitrecyclerview

interface RecyclerViewHolderData<in ITEM> {
    val layoutRes: Int

    fun setBinding(item: ITEM)
}