package com.example.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.homework6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kitchenList = ArrayList<Kitchen>()
        val k1 = Kitchen("burger","Burger")
        val k2 = Kitchen("doner","Döner")
        val k3 = Kitchen("kebap","Kebap")
        val k4 = Kitchen("baklava","Baklava")
        val k5 = Kitchen("kofte","Köfte")
        val k6 = Kitchen("kahvalti","Kahvaltı")
        val k7 = Kitchen("tantuni","Tantuni")
        val k8 = Kitchen("tavuk","Tavuk")

        kitchenList.add(k1)
        kitchenList.add(k2)
        kitchenList.add(k3)
        kitchenList.add(k4)
        kitchenList.add(k5)
        kitchenList.add(k6)
        kitchenList.add(k7)
        kitchenList.add(k8)
        binding.kitchenRecyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val kitchenAdapter = KitchenAdapter(kitchenList,this)
        binding.kitchenRecyclerView.adapter = kitchenAdapter

        val campaignList = ArrayList<Restaurant>()
        val r1 = Restaurant("borek","40 TL İndirim","4.5 (1500+)","Bülent Börek","Min. 120 TL","Börek","30-40dk","2.0 km")
        val r2 = Restaurant("lahmacun","%10 + 40 TL İndirim","4.6 (1000+)","Birbey Restoran","Min. 120 TL","Lahmacun","20-30dk","2.8 km")
        val r3 = Restaurant("et_doner","Trendyol Özel Menü","4.4 (700+)","Sedef Büfe","Min. 90 TL","Döner","15-25dk","0.2 km")
        val r4 = Restaurant("ci_borek","Trendyol Yemek Ö...","4.3 (70+)","Meşhur Çi Börek","Min. 100 TL","Börek","30-40dk","1.8 km")
        val r5 = Restaurant("ekler","%10 + 40 TL İndirim","4.7 (250+)","Ekleristan","Min. 120 TL","Tatlı","10-15dk","2.6 km")
        val r6 = Restaurant("pide","40 TL İndirim","4.5 (100+)","Damla Pide","Min. 120 TL","Pide","20-25dk","2.5 km")
        val r7 = Restaurant("pilav","40 TL İndirim","4.2 (150+)","Unkapanı Pilavcısı","Min. 100 TL","Ev Yem...","40-50dk","1.5 km")
        val r8 = Restaurant("urfa_kebap","40 TL İndirim","4.1 (750+)","Şanlı Urfa Kebap","Min. 120 TL","Kebap","30-40dk","1.4 km")

        campaignList.add(r1)
        campaignList.add(r2)
        campaignList.add(r3)
        campaignList.add(r4)
        campaignList.add(r5)
        campaignList.add(r6)
        campaignList.add(r7)
        campaignList.add(r8)
        binding.campaignRecyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val restaurantAdapter = RestaurantAdapter(campaignList,this)
        binding.campaignRecyclerView.adapter = restaurantAdapter

        val saleList = ArrayList<Restaurant>()
        saleList.add(r5)
        saleList.add(r6)
        saleList.add(r7)
        saleList.add(r8)
        saleList.add(r1)
        saleList.add(r2)
        saleList.add(r3)
        saleList.add(r4)
        binding.saleRecyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val saleRestaurantAdapter = SaleRestaurantAdapter(saleList,this)
        binding.saleRecyclerView.adapter = saleRestaurantAdapter

        val nearList = ArrayList<Restaurant>()
        nearList.add(r7)
        nearList.add(r8)
        nearList.add(r6)
        nearList.add(r3)
        nearList.add(r5)
        nearList.add(r4)
        nearList.add(r2)
        nearList.add(r1)

        binding.nearRecyclerView.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val nearRestaurantAdapter = SaleRestaurantAdapter(nearList,this)
        binding.nearRecyclerView.adapter = nearRestaurantAdapter

    }
}