package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   private lateinit var falseButtonnnnn:Button
   private lateinit var trueButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        falseButtonnnnn = findViewById(R.id.false_button)
        trueButton = findViewById(R.id.true_button)

        falseButtonnnnn.setOnClickListener {
            val toast=  Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,20,20)
            toast.show()

        }

        trueButton.setOnClickListener {
            val toast=Toast.makeText(this,R.string.incorrect_toast,Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP,20,20)
            toast.show()
        }

    }
}