package com.example.got

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

            val DiceImage: ImageView= findViewById(R.id.imageView2)
            when(Acdata) {
                1 -> DiceImage.setImageResource(R.drawable.dice_1)
                2 -> DiceImage.setImageResource(R.drawable.dice_2)
                3 -> DiceImage.setImageResource(R.drawable.dice_3)
                4 -> DiceImage.setImageResource(R.drawable.dice_4)
                5 -> DiceImage.setImageResource(R.drawable.dice_5)
                6 -> DiceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
