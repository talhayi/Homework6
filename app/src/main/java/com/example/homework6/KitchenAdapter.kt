package com.example.homework6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.databinding.KitchenItemLayoutBinding

class KitchenAdapter(private var kitchenList: List<Kitchen>, private var mContext: Context): RecyclerView.Adapter<KitchenAdapter.KitchenViewHolder>() {
    inner class KitchenViewHolder(var binding: KitchenItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KitchenViewHolder {
        val binding = KitchenItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KitchenViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return kitchenList.size
    }

    override fun onBindViewHolder(holder: KitchenViewHolder, position: Int) {
        val kitchen = kitchenList[position]

        holder.binding.apply {
            imageViewKitchen.setImageResource(mContext.resources.getIdentifier(kitchen.kitchenImage, "drawable", mContext.packageName))
            textViewKitchen.text = kitchen.kitchenName
        }
    }
}