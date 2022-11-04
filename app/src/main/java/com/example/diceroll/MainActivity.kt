package com.example.diceroll

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var randomView : TextView
    lateinit var inputEditText: EditText
    lateinit var Image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomView = findViewById(R.id.randomTextView)
        inputEditText = findViewById(R.id.inputEditText)
        Image = findViewById(R.id.imageView)

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            randomNumber()
        }
    }

    fun randomNumber () : Unit {
        val sides = inputEditText.text.toString().toIntOrNull()
        if(sides == null) {
            return
        }

        val randomValues = (1..sides).random()
        randomView.text = randomValues.toString()
       //30Log.d("###",randomValues.toString())

        when(randomValues)
        {
            1-> Image.setBackgroundResource(R.drawable.dice1)
            2-> Image.setBackgroundResource(R.drawable.dice2)
            3-> Image.setBackgroundResource(R.drawable.dice3)
            4-> Image.setBackgroundResource(R.drawable.dice4)
            5-> Image.setBackgroundResource(R.drawable.dice5)
            6-> Image.setBackgroundResource(R.drawable.dice6)

        }



    }



}

