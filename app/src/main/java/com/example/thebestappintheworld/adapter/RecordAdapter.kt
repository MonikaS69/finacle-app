package com.example.thebestappintheworld.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.thebestappintheworld.R
import com.example.thebestappintheworld.model.RecordModel


class RecordAdapter(var ds:List<RecordModel>):
    RecyclerView.Adapter<RecordAdapter.RecordViewHolder>() {

    class RecordViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val rdIcon: ImageView
        val rdName: TextView
        val rdSubName: TextView
        val rdAmount: TextView
        val rdDate: TextView
        val rdImg : CardView
            init {
                rdIcon = itemView.findViewById(R.id.recordIcon)
                rdName = itemView.findViewById(R.id.recordName)
                rdSubName = itemView.findViewById(R.id.recordSubName)
                rdAmount = itemView.findViewById(R.id.recordAmount)
                rdDate = itemView.findViewById(R.id.recordDate)
                rdImg = itemView.findViewById(R.id.recordImg)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.record_item, parent, false)
        return RecordViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
            holder.rdIcon.setImageResource(ds[position].recordIcon)
            holder.rdName.text = ds[position].recordName
            holder.rdSubName.text = ds[position].recordSubName
            holder.rdAmount.text = ds[position].recordAmount
            holder.rdDate.text = ds[position].recordDate
//            holder.rdImg.setCardBackgroundColor()
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}