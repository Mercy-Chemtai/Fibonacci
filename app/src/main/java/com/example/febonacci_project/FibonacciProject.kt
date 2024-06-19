package com.example.febonacci_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

  class FibonacciProject( var numbers: List<Int>): RecyclerView.Adapter<ListHolder>(){
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
          val itemView = LayoutInflater.from((parent.context))
     .inflate(R.layout.number_item_list , parent,false)
          return ListHolder(itemView)
      }

      override fun onBindViewHolder(holder: ListHolder, position: Int){
          holder.tvNum.text= numbers[position].toString()
      }

      override fun getItemCount(): Int {
       return numbers.size
      }
  }
class ListHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNum = itemView.findViewById<TextView>(R.id.tvNum)
}