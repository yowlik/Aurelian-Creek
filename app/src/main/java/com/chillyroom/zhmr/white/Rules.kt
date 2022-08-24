package com.chillyroom.zhmr.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.chillyroom.zhmr.R

class Rules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
        val start=findViewById<Button>(R.id.startb1)
        start.setOnClickListener {
            val intent3=Intent(this@Rules,Game::class.java)
            startActivity(intent3)
        }
    }
}