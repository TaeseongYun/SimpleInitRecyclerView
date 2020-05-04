package com.tsdev.simpleinitrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val recyclerAdapter: ExampleRecyclerViewAdapter by lazy {
        ExampleRecyclerViewAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.run {
            adapter = recyclerAdapter
        }
    }
}
