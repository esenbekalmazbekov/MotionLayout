package com.company.motionlayoutrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.KeyCycle
import com.company.motionlayoutrecyclerview.coordinators.exapmle1.CoordinatorExaple1Activity
import com.company.motionlayoutrecyclerview.keyCycle.KeyCycleActivity
import com.company.motionlayoutrecyclerview.onClick.FirstActivity
import com.company.motionlayoutrecyclerview.transition.TransitionActivity
import com.company.motionlayoutrecyclerview.twoCircle.CircleActivity
import com.company.motionlayoutrecyclerview.viewpager.ViewPagerActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        listeners()
    }

    private fun listeners() {
        onClick.setOnClickListener { startActivity(Intent(this, FirstActivity::class.java)) }
        keyCycle.setOnClickListener { startActivity(Intent(this, KeyCycleActivity::class.java)) }
        keyPosition.setOnClickListener { startActivity(Intent(this, CircleActivity::class.java)) }
        scenes.setOnClickListener { startActivity(Intent(this,TransitionActivity::class.java)) }
        coordinator1.setOnClickListener { startActivity(Intent(this,CoordinatorExaple1Activity::class.java)) }
        viewpager.setOnClickListener { startActivity(Intent(this,ViewPagerActivity::class.java)) }
    }
}