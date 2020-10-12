package com.company.motionlayoutrecyclerview.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.transition.Explode
import androidx.transition.Scene
import androidx.transition.Slide
import androidx.transition.TransitionManager
import com.company.motionlayoutrecyclerview.R
import kotlinx.android.synthetic.main.activity_transition.*

class TransitionActivity : AppCompatActivity() {
    private var scene1 : Scene? = null
    private var scene2 : Scene? = null
    private var scene3 : Scene? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        initScenes()
        scene1!!.enter()

    }

    private fun initScenes() {
        scene1 = Scene.getSceneForLayout(rootContainer,R.layout.scene1,this)
        scene2 = Scene.getSceneForLayout(rootContainer,R.layout.scene2,this)
        scene3 = Scene.getSceneForLayout(rootContainer,R.layout.scene3,this)
    }

    fun onClick1 (view : View) {
        TransitionManager.go(scene2!!)
    }

    fun onClick2 (view : View) {
        val explore = Explode()
        TransitionManager.go(scene3!!,explore)
    }

    fun onClick3 (view : View) {
        val slide = Slide(Gravity.END)
        TransitionManager.go(scene1!!,slide)
    }
}