package com.example.thebestappintheworld.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.IntegerRes
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.model.CardModel
import kotlin.random.Random

class CardAdapter(var ds:List<CardModel>):
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView
        val cardAmount: TextView
        val cardView: CardView

        init {
            cardTitle = itemView.findViewById(R.id.cardInfoTitle)
            cardAmount = itemView.findViewById(R.id.cardInfoAmount)
            cardView = itemView.findViewById(R.id.CardHolder)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.setIsRecyclable(false);
        holder.cardTitle.text = ds[position].cardTitle
        holder.cardAmount.text = ds[position].cardAmount
        val color = ((Math.random() * 191).toInt() shl 16) or
                ((Math.random() * 191).toInt() shl 8) or
                ((Math.random() * 191).toInt()) or
                (0xFF shl 24)
        holder.cardView.setCardBackgroundColor(color)
    }

        override fun getItemCount(): Int {
            return ds.size
        }
    }