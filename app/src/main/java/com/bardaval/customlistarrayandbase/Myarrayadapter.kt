package com.bardaval.customlistarrayandbase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Myarrayadapter(var mctx: Context, var resources: Int, var items: List<Model>) :
    ArrayAdapter<Model>(mctx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mctx)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val titleTextView: TextView = view.findViewById(R.id.textview1)
        val descriptionTextView: TextView = view.findViewById(R.id.textview2)

        val mItem: Model = items[position]
        imageView.setImageDrawable(mctx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        // Set OnClickListener for the imageView
        imageView.setOnClickListener {
            Toast.makeText(mctx, mItem.title, Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
