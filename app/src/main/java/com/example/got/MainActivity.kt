package com.example.got

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rolling:Button=findViewById(R.id.button)
        rolling.setOnClickListener{
            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT).show()
            val data:TextView= findViewById(R.id.textView2)
            val Acdata:Int = (1..6).random()
            data.text="$Acdata"
        }
    }
}

