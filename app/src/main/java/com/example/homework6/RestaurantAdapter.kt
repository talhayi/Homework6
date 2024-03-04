package com.example.homework6

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.databinding.RestaurantItemLayoutBinding

class RestaurantAdapter(private var restaurantList: List<Restaurant>, private var mContext: Context): RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    inner class RestaurantViewHolder(var binding: RestaurantItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val binding = RestaurantItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RestaurantViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurantList[position]

        holder.binding.apply {
            textViewSaleTag.text = restaurant.saleTag
            imageViewRestaurant.setImageResource(mContext.resources.getIdentifier(restaurant.restaurantImage, "drawable", mContext.packageName))
            textViewPoint.text = restaurant.point
            textViewRestaurantName.text = restaurant.restaurantName
            textViewSale.text = restaurant.sale
            textViewKitchen.text = " • ${restaurant.kitchen}"
            textViewDelivery.text = restaurant.delivery
            textViewDistance.text = " • ${restaurant.distance}"
        }
    }
}