package com.chillyroom.zhmr.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.chillyroom.zhmr.R

class Res : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)
        val score=findViewById<TextView>(R.id.scoret)
        val star=findViewById<Button>(R.id.startb)
        val rul=findViewById<Button>(R.id.rulesb)
        score.text=getIntent().getStringExtra("score")
        star.setOnClickListener {
            val intent1= Intent(this@Res, Game::class.java)
            startActivity(intent1)
        }
        rul.setOnClickListener {
            val intent2=Intent(this@Res, Rules::class.java)
            startActivity(intent2)
        }
    }
}