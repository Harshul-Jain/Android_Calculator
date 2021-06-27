package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private var result:String="0"
    private var operator:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn0.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp!=0){
                temp *= 10
                tvVar1.text = temp.toString()
            }
        }
        btn1.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "1"
            }
            else{
                temp=temp*10+1
                tvVar1.text=temp.toString()
            }
        }
        btn2.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "2"
            }
            else{
                temp=temp*10+2
                tvVar1.text=temp.toString()
            }
        }
        btn3.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "3"
            }
            else{
                temp=temp*10+3
                tvVar1.text=temp.toString()
            }
        }
        btn4.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "4"
            }
            else{
                temp=temp*10+4
                tvVar1.text=temp.toString()
            }
        }
        btn5.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "5"
            }
            else{
                temp=temp*10+5
                tvVar1.text=temp.toString()
            }
        }
        btn6.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "6"
            }
            else{
                temp=temp*10+6
                tvVar1.text=temp.toString()
            }
        }
        btn7.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "7"
            }
            else{
                temp=temp*10+7
                tvVar1.text=temp.toString()
            }
        }
        btn8.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "8"
            }
            else{
                temp=temp*10+8
                tvVar1.text=temp.toString()
            }
        }
        btn9.setOnClickListener {
            var temp=tvVar1.text.toString().toInt()
            if(temp==0){
                tvVar1.text = "9"
            }
            else{
                temp=temp*10+9
                tvVar1.text=temp.toString()
            }
        }
        btnClear.setOnClickListener{
            tvVar1.text="0"
            result=""
            operator=""
        }
        btnEqual.setOnClickListener {
            when(operator){
                "+"->{
                    val res=result.toInt()+tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "-"->{
                    val res=result.toInt()-tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "*"->{
                    val res=result.toInt()*tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "/"->{
                    val temp=tvVar1.text.toString().toInt()
                    if(temp==0){
                        Toast.makeText(this,"Dividing by zero",Toast.LENGTH_SHORT).show()
                    }
                    else{
                        val res=result.toInt()/tvVar1.text.toString().toInt()
                        result=res.toString()
                        tvVar1.text=result
                    }
                }
                else->{
                    Toast.makeText(this,"No operation Done",Toast.LENGTH_SHORT).show()
                    result="0"
                }
            }
            tvVar1.text=result
            operator=""
        }
        btnAdd.setOnClickListener {
            when(operator){
                "+"->{
                    val res=result.toInt()+tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "-"->{
                    val res=result.toInt()-tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "*"->{
                    val res=result.toInt()*tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "/"-> {
                    val temp = tvVar1.text.toString().toInt()
                    if (temp == 0) {
                        Toast.makeText(this, "Dividing by zero,Clear and Try Again", Toast.LENGTH_SHORT).show()

                    } else {
                        val res=result.toInt()/tvVar1.text.toString().toInt()
                        result=res.toString()
                        tvVar1.text=result
                    }
                }
                else-> {
                    result = tvVar1.text.toString()
                    tvVar1.text = "0"
                }
            }
            operator="+"
            tvVar1.text="0"
        }
        btnSub.setOnClickListener {
            when(operator){
                "+"->{
                    val res=result.toInt()+tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "-"->{
                    val res=result.toInt()-tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "*"->{
                    val res=result.toInt()*tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "/"-> {
                    val temp = tvVar1.text.toString().toInt()
                    if (temp == 0) {
                        Toast.makeText(this, "Dividing by zero,Clear and Try Again", Toast.LENGTH_SHORT).show()

                    } else {
                        val res=result.toInt()/tvVar1.text.toString().toInt()
                        result=res.toString()
                        tvVar1.text=result
                    }
                }
                else-> {
                    result = tvVar1.text.toString()
                    tvVar1.text = "0"
                }
            }
            operator="-"
            tvVar1.text="0"
        }
        btnDiv.setOnClickListener {
            when(operator){
                "+"->{
                    val res=result.toInt()+tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "-"->{
                    val res=result.toInt()-tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "*"->{
                    val res=result.toInt()*tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "/"-> {
                    val temp = tvVar1.text.toString().toInt()
                    if (temp == 0) {
                        Toast.makeText(this, "Dividing by zero,Clear and Try Again", Toast.LENGTH_SHORT).show()

                    } else {
                        val res=result.toInt()/tvVar1.text.toString().toInt()
                        result=res.toString()
                        tvVar1.text=result
                    }
                }
                else-> {
                    result = tvVar1.text.toString()
                    tvVar1.text = "0"
                }
            }
            operator="/"
            tvVar1.text="0"
        }
        btnMult.setOnClickListener {
            when(operator){
                "+"->{
                    val res=result.toInt()+tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "-"->{
                    val res=result.toInt()-tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "*"->{
                    val res=result.toInt()*tvVar1.text.toString().toInt()
                    result=res.toString()
                    tvVar1.text=result
                }
                "/"-> {
                    val temp = tvVar1.text.toString().toInt()
                    if (temp == 0) {
                        Toast.makeText(this, "Dividing by zero,Clear and Try Again", Toast.LENGTH_SHORT).show()

                    } else {
                        val res=result.toInt()/tvVar1.text.toString().toInt()
                        result=res.toString()
                        tvVar1.text=result
                    }
                }
                else-> {
                    result = tvVar1.text.toString()
                    tvVar1.text = "0"
                }
            }
            operator="*"
            tvVar1.text="0"
        }
    }

}