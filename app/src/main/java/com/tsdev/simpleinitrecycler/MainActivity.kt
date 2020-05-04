package com.tsdev.simpleinitrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val recyclerAdapter: ExampleRecyclerViewAdapter by lazy {
        ExampleRecyclerViewAdapter()
    }
    private val presenter: Presenter by lazy {
        Presenter(recyclerAdapter.adapterViewModel)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.setItem()
        recyclerview.run {
            adapter = recyclerAdapter
        }
    }
}
