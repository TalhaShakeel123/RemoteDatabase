package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imageView=findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener()
        {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        val textview=findViewById<TextView>(R.id.textView1)
        val received=intent.getStringExtra("name")
        textview.text=received



    }
}