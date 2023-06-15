package com.simvic.simvic_101

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<View>(R.id.visitWebsite) as Button
        val button2 = findViewById<View>(R.id.CheckCurrentPrice) as Button
        val button3 = findViewById<View>(R.id.call) as Button
        val button4 = findViewById<View>(R.id.privacypolicy) as Button

        button1.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://simvic.co.uk/en/")
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://simvic.co.uk/en/scrap-metal-prices/")
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:07411293460")
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://simvic.co.uk/en/privacy-policy/")
            startActivity(intent)
        }
    }
}

