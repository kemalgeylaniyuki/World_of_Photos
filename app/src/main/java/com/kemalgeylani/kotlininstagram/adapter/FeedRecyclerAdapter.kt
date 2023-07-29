package com.kemalgeylani.kotlininstagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kemalgeylani.kotlininstagram.databinding.RecyclerRowBinding
import com.kemalgeylani.kotlininstagram.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(val postArrayList: ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.FeedRecyclerHolder>() {

    class FeedRecyclerHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedRecyclerHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FeedRecyclerHolder(recyclerRowBinding)
    }

    override fun getItemCount(): Int {
        return postArrayList.size
    }

    override fun onBindViewHolder(holder: FeedRecyclerHolder, position: Int) {
        holder.binding.recyclerViewEmail.text = postArrayList.get(position).email
        holder.binding.recyclerViewComment.text = postArrayList.get(position).comment
        Picasso.get().load(postArrayList.get(position).downloadUrl).into(holder.binding.recyclerViewImageView)

    }
}