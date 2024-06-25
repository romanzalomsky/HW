package com.zalomsky.hw

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button2)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            val imageUrl = findViewById<EditText>(R.id.edit_text).text.toString()

            Picasso.get()
                .load(imageUrl)
                .into(imageView, object : Callback {
                    override fun onSuccess() {
                    }

                    override fun onError(e: Exception) {
                        Toast.makeText(applicationContext, "Ошибка загрузки изображения", Toast.LENGTH_SHORT).show()
                    }
                })
        }
    }
}