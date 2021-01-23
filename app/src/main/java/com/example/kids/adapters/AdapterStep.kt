package com.example.kids.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kids.MainActivity2
import com.example.kids.R
import com.example.kids.models.Data
import kotlinx.android.synthetic.main.item_view.view.*

class AdapterStep(val data: ArrayList<Data>, val listener: MainActivity2) : RecyclerView.Adapter<AdapterStep.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
    )

    override fun onBindViewHolder(holder: AdapterStep.ViewHolder, position: Int) {

        holder.itemView.apply {
            steps.text = data[position].step
        }


    }

    override fun getItemCount() = data.size


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)

        }

        override fun onClick(v: View?) {

            val position: Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }


        }

    }

    interface OnItemClickListener {

        fun onItemClick(position: Int)
    }
}