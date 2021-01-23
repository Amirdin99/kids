package com.example.kids

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kids.adapters.AdapterStep
import com.example.kids.models.Data
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private val data = ArrayList<Data>()
    private var adapter= AdapterStep(data,this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        loadData()

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)
    }

    fun loadData() {


        for (i in 1..10) {

            data.add(Data("Step" + i))
        }
    }

        fun onItemClick(position: Int) {
            startActivity(Intent(this,MainActivity::class.java))




    }
}