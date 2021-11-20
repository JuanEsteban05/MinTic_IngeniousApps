package com.example.sitiosturisticos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.sitiosturisticos.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonC = findViewById<ImageButton>(R.id.btnCastillo)
        buttonC.setOnClickListener{
            intent = Intent(this, castillo::class.java)
            startActivity(intent)
        }

        val buttonI = findViewById<ImageButton>(R.id.btnIsla)
        buttonI.setOnClickListener{
            intent = Intent(this, IslasRosario::class.java)
            startActivity(intent)
        }

        val buttonM = findViewById<ImageButton>(R.id.btnMuseo)
        buttonM.setOnClickListener{
            intent = Intent(this, MuseoInquisicion::class.java)
            startActivity(intent)
        }

        val buttonP = findViewById<ImageButton>(R.id.btnPlaza)
        buttonP.setOnClickListener{
            intent = Intent(this, PlazaSantoDomingo::class.java)
            startActivity(intent)
        }

        val buttonT = findViewById<ImageButton>(R.id.btnTorre)
        buttonT.setOnClickListener{
            intent = Intent(this, TorreReloj::class.java)
            startActivity(intent)
        }

    }


}