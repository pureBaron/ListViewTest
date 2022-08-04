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

    private val idMap = mapOf("Apple" to R.drawable.apple_pic,
    "Banana" to R.drawable.banana_pic,
    "Orange" to R.drawable.orange_pic,
    "Watermelon" to R.drawable.watermelon_pic,
    "Pear" to R.drawable.pear_pic,
    "Grape" to R.drawable.grape_pic,
    "Pineapple" to R.drawable.pineapple_pic,
    "Strawberry" to R.drawable.strawberry_pic,
    "Cherry" to R.drawable.cherry_pic,
    "Mango" to R.drawable.mango_pic)




    val fruitList = ArrayList<Fruit>()
    private fun initList() {
        repeat(2 ){
            for(mapEntry in idMap.entries){
                fruitList.add(Fruit(mapEntry.key, mapEntry.value))
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initList()

        val adapter = FruitAdapter(this , R.layout.fruit_item , fruitList)
        listView.adapter = adapter
    }

}