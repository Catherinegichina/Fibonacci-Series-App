package com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvnumber:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvnumber=findViewById(R.id.rvNumber)
        rvnumber.layoutManager=LinearLayoutManager(baseContext)
        var numAdapter=NumberRecyclerViewAdapter(fibonacci(count =100))
        rvnumber.adapter=numAdapter
    }
    fun fibonacci(count:Int):List<BigInteger>{
        var begin=BigInteger.ZERO
        var next=BigInteger.ONE
        var numb= MutableList<BigInteger>(count,{ BigInteger.ZERO})
        numb[0]=begin
        numb[1]=next
        for (i in 1..count){
            var sum=begin+next
            begin=next
            next=sum
            numb[i-1]=begin
        }
        return numb
    }
}