package com.omgodse.notally.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.omgodse.notally.databinding.RecyclerPreviewImageBinding
import com.omgodse.notally.recyclerview.viewholders.PreviewImageVH
import com.omgodse.notally.room.Image
import java.io.File

class PreviewImageAdapter(private val root: File, private val onClick: (position: Int) -> Unit) :
    ListAdapter<Image, PreviewImageVH>(DiffCallback) {

    override fun onBindViewHolder(holder: PreviewImageVH, position: Int) {
        val image = getItem(position)
        holder.bind(root, image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreviewImageVH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerPreviewImageBinding.inflate(inflater, parent, false)
        return PreviewImageVH(binding, onClick)
    }

    private object DiffCallback : DiffUtil.ItemCallback<Image>() {

        override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem == newItem
        }
    }
}