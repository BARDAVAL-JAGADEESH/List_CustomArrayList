package com.bardaval.customlistarrayandbase

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CustomListBaseAdapter : AppCompatActivity() {

    lateinit var listView: ListView
    var arrayList: ArrayList<Mydata> = ArrayList()
    var adapter: MybaseAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_base_adapter)

        listView = findViewById(R.id.myListView)

        arrayList.add(Mydata(1, "Bardaval", "9347052901"))
        arrayList.add(Mydata(2, "Jagadeesh", "9873737827"))
        arrayList.add(Mydata(3, "Karan singh", "7636222625"))

        adapter = MybaseAdapter(this, arrayList)
        listView.adapter = adapter
    }
}
