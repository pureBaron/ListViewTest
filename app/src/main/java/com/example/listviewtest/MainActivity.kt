package com.example.listviewtest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val data = listOf("Apple", "Banana", "Orange", "Watermelon",
        "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
        "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
        "Pineapple", "Strawberry", "Cherry", "Mango")

    private val idMap = mapOf("Apple" to R.drawable.apple_pic)
    val fruitList = ArrayList<Fruit>()
    private fun initList() {
        repeat(2 ){
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
            fruitList.add(Fruit("Banana" , R.drawable.banana_pic))
            fruitList.add(Fruit("Oran" , R.drawable.apple_pic))
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
            fruitList.add(Fruit("Apple" , R.drawable.apple_pic))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter
    }

}