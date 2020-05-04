package com.tsdev.simpleinitrecycler

class Presenter(private val adapterViewModel: ExampleRecyclerAdapterViewModel) {
    fun setItem() {
        adapterViewModel.run {
            recyclerAdapterData.addItems(
                listOf(
                    ExampleData("태성", 25),
                    ExampleData("에빈", 22)
                )
            )
            notifiedItemChange()
        }

    }
}