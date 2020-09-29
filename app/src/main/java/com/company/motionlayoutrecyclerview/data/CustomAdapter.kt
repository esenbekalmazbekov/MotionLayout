package com.company.motionlayoutrecyclerview.data

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.company.motionlayoutrecyclerview.onClick.DetailActivity
import com.company.motionlayoutrecyclerview.R
import kotlinx.android.synthetic.main.entity_news.view.img_news_source_logo
import kotlinx.android.synthetic.main.entity_news.view.img_thumb
import kotlinx.android.synthetic.main.entity_news.view.tv_news_category
import kotlinx.android.synthetic.main.entity_news.view.tv_news_date
import kotlinx.android.synthetic.main.entity_news.view.tv_news_desc
import kotlinx.android.synthetic.main.entity_news.view.tv_news_source
import kotlinx.android.synthetic.main.entity_news.view.tv_news_title

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
    private var models = ArrayList<POJONews>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CustomViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.entity_news, parent, false)
    )

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) =
        holder.bind(models[position])

    override fun getItemCount() = models.size

    fun submitList(newModels: ArrayList<POJONews>) {
        models = newModels
        notifyDataSetChanged()
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: POJONews) {
            itemView.apply {
                Glide.with(context).load(item.img_thumb).into(img_thumb)

                tv_news_source.text = item.news_source
                tv_news_title.text = item.news_title
                tv_news_desc.text  = item.news_desc

                Glide.with(context).load(item.news_desc_logo).into(img_news_source_logo)

                tv_news_date.text = item.news_date
                tv_news_category.text = item.news_category

                img_thumb.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("news_source",item.news_source)
                    intent.putExtra("image_thumb_url",item.img_thumb)
                    intent.putExtra("news_title",item.news_title)
                    intent.putExtra("news_desc",item.news_desc)
                    intent.putExtra("news_desc_logo",item.news_desc_logo)
                    intent.putExtra("news_category",item.news_category)
                    intent.putExtra("news_date",item.news_date)

                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    context.startActivity(intent)
                }

            }
        }
    }
}