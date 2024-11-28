package com.bardaval.customlistarrayandbase

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CustomviewArrayadapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customview_arrayadapter)

        val listView = findViewById<ListView>(R.id.myListView)
        val button = findViewById<Button>(R.id.openBaseAdapterButton) // Button to open CustomListBaseAdapter

        val list = mutableListOf<Model>()
        list.add(Model("Linkedin", "Linkedin", R.drawable.linkedin))
        list.add(Model("Github", "Bardaval", R.drawable.github))
        list.add(Model("Live", "Lpu Live", R.drawable.live))
        list.add(Model("Touch", "Lpu Touch", R.drawable.touch))
        list.add(Model("Linkedin", "Linkedin", R.drawable.linkedin))
        list.add(Model("Insta", "Instagram", R.drawable.instagram))
        list.add(Model("Facebook", "facebook", R.drawable.fb))
        list.add(Model("Twitter", "Twitter", R.drawable.twitter))
        list.add(Model("Github", "Bardaval", R.drawable.github))
        list.add(Model("Live", "Lpu Live", R.drawable.live))
        list.add(Model("Touch", "Lpu Touch", R.drawable.touch))
        list.add(Model("Linkedin", "Linkedin", R.drawable.linkedin))
        list.add(Model("Insta", "Instagram", R.drawable.instagram))
        list.add(Model("Facebook", "facebook", R.drawable.fb))
        list.add(Model("Twitter", "Twitter", R.drawable.twitter))
        list.add(Model("Github", "Bardaval", R.drawable.github))
        list.add(Model("Live", "Lpu Live", R.drawable.live))
        list.add(Model("Touch", "Lpu Touch", R.drawable.touch))
        list.add(Model("Linkedin", "Linkedin", R.drawable.linkedin))
        list.add(Model("Insta", "Instagram", R.drawable.instagram))
        list.add(Model("Facebook", "facebook", R.drawable.fb))
        list.add(Model("Twitter", "Twitter", R.drawable.twitter))

        listView.adapter = Myarrayadapter(this, R.layout.listviewrow, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val selectedModel = list[position]
            Toast.makeText(this, selectedModel.title, Toast.LENGTH_SHORT).show()
        }

        // Setting up button click to open CustomListBaseAdapter activity
        button.setOnClickListener {
            val intent = Intent(this, CustomListBaseAdapter::class.java)
            startActivity(intent)
        }
    }
}
