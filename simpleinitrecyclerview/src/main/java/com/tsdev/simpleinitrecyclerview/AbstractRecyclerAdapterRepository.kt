package com.tsdev.simpleinitrecyclerview

open class AbstractRecyclerAdapterRepository<ITEM> :
    RecyclerAdapterData<ITEM> {

    private val adapterItem = mutableListOf<ITEM>()

    override fun addItem(item: ITEM) {
        adapterItem.add(item)
    }

    override fun addItems(items: List<ITEM>) {
        items.forEach {
            addItem(it)
        }
    }

    override fun clear() {
        adapterItem.clear()
    }

    override fun getItem(position: Int): ITEM = adapterItem[position]

    override fun removeItem(position: Int) {
        adapterItem.removeAt(position)
    }

    override val itemCount: Int
        get() = adapterItem.size
}