package com.chillyroom.zhmr.white

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import com.chillyroom.zhmr.R

import com.chillyroom.zhmr.databinding.ActivityGameBinding

class Game : AppCompatActivity() {
    val roll= mutableListOf<String>("1","2","3","4")


    private var timer: CountDownTimer?=null
    lateinit var binding: ActivityGameBinding
    var prog = 0
    var scr=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        scr=0
        var i1=roll.random()
        var i2=roll.random()
        checkText(i1)
        checkTextColor(i2)
        startTimer(2000)
        binding.im1.setOnClickListener {
            if (i1=="4"){
                scr++
                i1=roll.random()
                i2=roll.random()
                checkText(i1)
                checkTextColor(i2)
                binding.scre.text="$scr"
                prog=0
                startTimer(2000)
            }else
                timer?.onFinish()
        }
        binding.im2.setOnClickListener {
            if (i1=="3"){
                scr++
                i1=roll.random()
                i2=roll.random()
                checkText(i1)
                checkTextColor(i2)
                binding.scre.text="$scr"
                prog=0
                startTimer(2000)
            }else
                timer?.onFinish()
        }
        binding.im3.setOnClickListener {
            if (i1=="1"){
                scr++
                i1=roll.random()
                i2=roll.random()
                checkText(i1)
                checkTextColor(i2)
                binding.scre.text="$scr"
                prog=0
                startTimer(2000)
            }else
                timer?.onFinish()
        }
        binding.im4.setOnClickListener {
            if (i1=="2"){
                scr++
                i1=roll.random()
                i2=roll.random()
                checkText(i1)
                checkTextColor(i2)
                binding.scre.text="$scr"
                prog=0
                startTimer(2000)
            }else
                timer?.onFinish()
        }
    }


    private fun startTimer(timeMillis:Long){

        timer?.cancel()
        timer=object : CountDownTimer(timeMillis,50){
            override fun onTick(TimeEl: Long) {
                binding.progs.max=2000
                prog=prog+50
                ObjectAnimator.ofInt(binding.progs,"progress",prog)
                    .setDuration(50)
                    .start()
            }
            override fun onFinish() {
                timer?.cancel()
                val scrscr="Your score : ${scr.toString()}"
                val intent=Intent(this@Game, Res::class.java)
                intent.putExtra("score",scrscr)
                startActivity(intent)
            }

        }.start()

    }
    fun checkText(i:String){
        if(i=="1"){
            binding.textview1.text="Red"
        }
        else if(i=="2"){
            binding.textview1.text="Green"
        }
        else if(i=="3"){
            binding.textview1.text="Blue"
        }
        else if(i=="4"){
            binding.textview1.text="Yellow"
        }
    }

    fun checkTextColor(i:String){
        if(i=="1"){
            binding.textview1.setTextColor(getResources().getColor(R.color.blu))
        }
        else if(i=="2"){
            binding.textview1.setTextColor(getResources().getColor(R.color.red))
        }
        else if(i=="3"){
            binding.textview1.setTextColor(getResources().getColor(R.color.gre))
        }
        else if(i=="4"){
            binding.textview1.setTextColor(getResources().getColor(R.color.yel))
        }
    }
}