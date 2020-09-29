package com.company.motionlayoutrecyclerview.onClick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.company.motionlayoutrecyclerview.R
import com.company.motionlayoutrecyclerview.data.CustomAdapter
import com.company.motionlayoutrecyclerview.data.POJONews
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {
    private val adapter = CustomAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        initRV()
        createData()
    }

    private fun initRV() {
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = adapter
    }

    private fun createData() {
        val array = ArrayList<POJONews>()
        for (o in 1..10) {
            array.add(
                POJONews(
                    "https://cdn-images-1.medium.com/max/1024/1*S87q8VmsCa69qabpjD7EEQ.png",
                    "MEDIUM",
                    "Demystifying the new",
                    "During the #11WeeksOfAndroid the new Play In-App Review API was announced. This was a long due functionality that the Play team made available via the Play Core library.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT1PGRRoEczMAX1paQm9dX_Ovw7UNPalcYw-Q&usqp=CAU",
                    "Google Play Apps & Games",
                    "September 22, 2020"
                )
            )
        }
        adapter.submitList(array)
    }
}