package com.company.motionlayoutrecyclerview.onClick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.company.motionlayoutrecyclerview.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        bind()
    }

    private fun bind() {
        tv_news_source.text = intent.getStringExtra("news_source")
        Glide.with(this).load(intent.getStringExtra("image_thumb_url")).into(img_thumb)
        tv_news_title.text = intent.getStringExtra("news_title")
        tv_news_desc.text = intent.getStringExtra("news_desc")
        Glide.with(this).load(intent.getStringExtra("news_desc_logo")).into(img_news_source_logo)
        tv_news_category.text = intent.getStringExtra("news_category")
        tv_news_date.text = intent.getStringExtra("news_date")
    }
}