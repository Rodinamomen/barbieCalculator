package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class Calculator : AppCompatActivity() {
    lateinit var acButton: Button
    lateinit var numbersTxt : TextView
    lateinit var resultTxt: TextView
    lateinit var backSpace: Button
    lateinit var zeroBtn:Button
    lateinit var oneBtn:Button
    lateinit var twoBtn: Button
    lateinit var threeBtn: Button
    lateinit var fourBtn: Button
    lateinit var fiveBtn: Button
    lateinit var sixBtn: Button
    lateinit var sevenBtn: Button
    lateinit var eightBtn: Button
    lateinit var nineBtn: Button
    lateinit var plusBtn: Button
    lateinit var minusBtn:Button
    lateinit var divBtn: Button
    lateinit var mulBtn:Button
    lateinit var equalBtn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        oneBtn= findViewById(R.id.btn_1)
        zeroBtn= findViewById(R.id.btn_0)
        twoBtn= findViewById(R.id.btn_2)
        threeBtn= findViewById(R.id.btn_3)
        fourBtn= findViewById(R.id.btn_4)
        fiveBtn= findViewById(R.id.btn_5)
        sixBtn= findViewById(R.id.btn_6)
        sevenBtn= findViewById(R.id.btn_7)
        eightBtn= findViewById(R.id.btn_8)
        nineBtn= findViewById(R.id.btn_9)
        acButton= findViewById(R.id.btn_ac)
        numbersTxt= findViewById(R.id.txt_numbers)
        resultTxt=findViewById(R.id.txt_results)
        backSpace= findViewById(R.id.btn_backSpace)
        minusBtn=findViewById(R.id.btn_minus)
        divBtn= findViewById(R.id.btn_div)
        mulBtn=findViewById(R.id.btn_mul)
        plusBtn= findViewById(R.id.btn_plus)
        equalBtn=findViewById(R.id.btn_equal)

        acButton.setOnClickListener {
            clearAll()
        }
        backSpace.setOnClickListener {
            backSpace()
        }
        oneBtn.setOnClickListener {
            addNumber("1")
        }
        zeroBtn.setOnClickListener {
            addNumber("0")
        }
        twoBtn.setOnClickListener {
            addNumber("2")
        }
        threeBtn.setOnClickListener {
            addNumber("3")
        }
        fourBtn.setOnClickListener {
            addNumber("4")
        }
        fiveBtn.setOnClickListener {
            addNumber("5")
        }
        sixBtn.setOnClickListener {
            addNumber("6")
        }
        sevenBtn.setOnClickListener {
            addNumber("7")
        }
        eightBtn.setOnClickListener {
            addNumber("8")
        }
        nineBtn.setOnClickListener {
            addNumber("9")
        }
        plusBtn.setOnClickListener {
            addNumber(" + ")
        }
        mulBtn.setOnClickListener {
            addNumber( " * ")
        }
        minusBtn.setOnClickListener {
            addNumber(" - ")
        }
        divBtn.setOnClickListener {
            addNumber(" / ")
        }
        equalBtn.setOnClickListener {
            var nums = numbersTxt.text.toString()
           var Numbers : List<String> = nums.split(" ")
            var FirstNumber = Numbers[0].toDouble()
               if(Numbers[1].equals("+")){
                   var result= FirstNumber + Numbers[2].toDouble()
                   numbersTxt.text= result.toString()
               }
               if(Numbers[1].equals("-")){
                   var result= FirstNumber - Numbers[2].toDouble()
                   numbersTxt.text= result.toString()
               }
               if(Numbers[1].equals("/")){
                   var result= FirstNumber / Numbers[2].toDouble()
                   numbersTxt.text= result.toString()
               }
               if(Numbers[1].equals("*")){
                   var result= FirstNumber * Numbers[2].toDouble()
                   numbersTxt.text= result.toString()
               }


        }

    }

    private fun addNumber( number :String) {
       numbersTxt.append(number)
    }
    private fun clearAll() {
        numbersTxt.text=""
        resultTxt.text=""
    }
    private fun backSpace(){
        var length = numbersTxt.length()
      if( length>0){
          numbersTxt.text= numbersTxt.text.subSequence(0,length-1)
      }
    }
}