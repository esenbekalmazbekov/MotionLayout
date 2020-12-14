package com.company.motionlayoutrecyclerview.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.company.motionlayoutrecyclerview.R
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPagerHeader = findViewById<ViewpagerHeader>(R.id.motionLayout)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addPage("Page 1", R.layout.motion_16_viewpager_page1)
        adapter.addPage("Page 2", R.layout.motion_16_viewpager_page2)
        adapter.addPage("Page 3", R.layout.motion_16_viewpager_page3)
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        if (viewPagerHeader != null) {
            pager.addOnPageChangeListener(viewPagerHeader)
        }
    }
}