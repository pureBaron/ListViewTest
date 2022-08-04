package com.example.listviewtest

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FruitAdapter(activity : Activity,val resourceId : Int, fruitList : List<Fruit>) : ArrayAdapter<Fruit>(activity , resourceId , fruitList) {

    override fun getView(position : Int , convertView : View? , parent : ViewGroup) : View{
        val view  = LayoutInflater.from(context).inflate(resourceId , parent , false)
        val imageView : ImageView = view.findViewById(R.id.fruitImage)
        val textView : TextView = view.findViewById(R.id.fruitName)
        val fruit = getItem(position)
        imageView.setImageResource(fruit!!.imageID)
        textView.text = fruit.name

        return view

    }
}