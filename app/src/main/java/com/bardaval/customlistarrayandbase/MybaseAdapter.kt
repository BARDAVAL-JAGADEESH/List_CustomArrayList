package com.bardaval.customlistarrayandbase

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MybaseAdapter(private  val context:Context, private  val arrayList:java.util.ArrayList<Mydata>):BaseAdapter() {

    private lateinit var serialnumber: TextView
    private lateinit var name: TextView
    private lateinit var contactNum: TextView

    override fun getCount(): Int {

        return  arrayList.size
    }

    override fun getItem(position: Int): Any {
        return  position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        convertView = LayoutInflater.from(context)
            .inflate(R.layout.rowbase, parent,false)

        serialnumber = convertView.findViewById(R.id.serialnumber)
        name = convertView.findViewById(R.id.studentname)
        contactNum = convertView.findViewById(R.id.mobileNum)

        serialnumber.text = "" + arrayList[position].num
        name.text = arrayList[position].name
        contactNum.text = arrayList[position].mobilenumber
        return convertView


    }

}





/*
package com.bardaval.customlistex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MybaseAdapter(private val context: Context, private val arrayList: ArrayList<Mydata>) : BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View

        val viewHolder: ViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_mybase_adapter, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val data = arrayList[position]
        viewHolder.serialnumber.text = data.num.toString()
        viewHolder.name.text = data.name
        viewHolder.contactNum.text = data.mobilenumber

        return view
    }

    private class ViewHolder(view: View) {
        val serialnumber: TextView = view.findViewById(R.id.serialnumber)
        val name: TextView = view.findViewById(R.id.studentname)
        val contactNum: TextView = view.findViewById(R.id.mobileNum)
    }
}

*/





