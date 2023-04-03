package com.example.thebestappintheworld.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.databinding.ActivityExpenseBinding

class ExpenseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExpenseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myArray = resources.getStringArray(R.array.category)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, myArray)
        binding.spinnerCategory.adapter = adapter
    }
}