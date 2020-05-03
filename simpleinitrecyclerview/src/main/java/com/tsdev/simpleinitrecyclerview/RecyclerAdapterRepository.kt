package com.tsdev.simpleinitrecyclerview

class RecyclerAdapterRepository : RecyclerAdapterData<Any> {

    override val adapterItem: MutableList<Any> = mutableListOf()

    override fun addItem(item: Any) {
        adapterItem.add(item)
    }

    override fun addItems(items: List<Any>) {
        items.forEach {
            addItem(it)
        }
    }

    override fun clear() {
        adapterItem.clear()
    }

    override val itemCount: Int = adapterItem.size

    override fun getItem(position: Int): Any = adapterItem[position]

    override fun removeItem(position: Int) {
        adapterItem.removeAt(position)
    }
}