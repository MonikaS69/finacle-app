package com.example.thebestappintheworld.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thebestappintheworld.adapter.CardAdapter
import com.example.thebestappintheworld.databinding.ActivityWalletBinding
import com.example.thebestappintheworld.model.CardModel

class WalletActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWalletBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ds = mutableListOf<CardModel>()

        ds.add(CardModel("Billy","600.000đ"))
        ds.add(CardModel("Cash","1.000.000đ"))
        ds.add(CardModel("Danial","20.000đ"))
        ds.add(CardModel("Joe","100.000đ"))
        ds.add(CardModel("Trump","9.000đ"))

        val adapterv = CardAdapter(ds)
        binding.cardRecycleView.adapter = adapterv
        binding.cardRecycleView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
    }
}