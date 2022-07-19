package com.example.assignment51

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

//Main Activity
class MainActivity : AppCompatActivity() {
    private var level:Int = 0
    private lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
    }

    /**
     * Handles the click of the minus and plus button
     * Changes level of the level-list drawable
     * Checks to see if you can increase or decrease the level
     */
    fun handleClick(view: View) {
        val id = view.id
        when(id){
            R.id.plusButton -> {if(level<7){level++}}
            R.id.minusButton -> {if(level>0){level--}}
        }
        if(level >= 0 && level <= 7){
            imageView.setImageLevel(level)
        }
    }
}