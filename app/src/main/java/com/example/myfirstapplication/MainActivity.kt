package com.example.myfirstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        val textview=findViewById<TextView>(R.id.textView2)
        val btn2=findViewById<Button>(R.id.button2)
        btn2.setOnClickListener()
        {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fbise.com"))
            startActivity(intent)
        }

        btn.setOnClickListener()
        {
            val Intent=Intent(this,MainActivity2::class.java)
            val data=textview.text.toString()
             Intent.putExtra("name",data)
            startActivity(Intent)
        }


    }
}