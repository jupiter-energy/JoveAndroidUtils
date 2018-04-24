package com.jove.android.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProtogenesisRecyclerViewTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protogenesis_recycler_view_test)
    }

    private class RVAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        val data = listOf("a.123", "b.23.23", "c.1231.122.222")


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            var v = LayoutInflater.from(parent.context).inflate(R.layout.item_protogenesis_recycler_view_test, parent);
            return  RVHolder(v)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        }

        override fun getItemCount(): Int {
            return data.size
        }
    }

    private class RVHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textView: TextView = itemView.findViewById(R.id.tv_text)
        //var t = TextView
        fun fillData(item: String) {
        }
    }
}
