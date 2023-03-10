package com.example.pantallarazas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.humana)
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.goblin)
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.elfa)
        }
        findViewById<Button>(R.id.button4).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.enana)
        }

        findViewById<Button>(R.id.button0).setOnClickListener{
            startActivity(Intent(this,ActivityVacia2 :: class.java))
        }
    }
}