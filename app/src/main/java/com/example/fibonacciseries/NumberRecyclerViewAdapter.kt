package com.example.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberRecyclerViewAdapter(var numberList: List<BigInteger>):RecyclerView.Adapter<NumsViewHolder>(){
    override fun  onCreateViewHolder(parent: ViewGroup, viewType:Int):NumsViewHolder{
    var numbView=LayoutInflater.from(parent.context).inflate(R.layout.numberlistitems,parent,false)
    return NumsViewHolder(numbView)
    }
    override fun onBindViewHolder(holder:NumsViewHolder,position:Int){
        holder.tvNumber.text=numberList.get(position).toString()
    }
    override fun getItemCount():Int{
        return numberList.size
    }}
class NumsViewHolder(numbView:View):RecyclerView.ViewHolder(numbView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)!!
}