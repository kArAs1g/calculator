package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var text = ""
        var result = 0
        var currentSymbol = ' '

        binding.btnAC.setOnClickListener{
            text = ""
            currentSymbol = ' '
            result = 0
            binding.mathResult.setText("")
        }

        binding.btnPlus.setOnClickListener {
            if (text.isEmpty()) else result = text.toInt()
            currentSymbol = '+'
            text = ""
            binding.mathResult.setText(text)
        }

        binding.btnMinus.setOnClickListener{
            if (text.isEmpty()) else result = text.toInt()
            currentSymbol = '-'
            text = ""
            binding.mathResult.setText(text)
        }

        binding.btnMult.setOnClickListener{
            if (text.isEmpty()) else result = text.toInt()
            currentSymbol = '*'
            text = ""
            binding.mathResult.setText(text)
        }

        binding.btnDiv.setOnClickListener{
            if (text.isEmpty()) else result = text.toInt()
            currentSymbol = '/'
            text = ""
            binding.mathResult.setText(text)
        }

        binding.btn0.setOnClickListener{
            text += "0"
            binding.mathResult.setText(text)
        }
        binding.btn1.setOnClickListener{
            text += "1"
            binding.mathResult.setText(text)
        }
        binding.btn2.setOnClickListener{
            text += "2"
            binding.mathResult.setText(text)
        }
        binding.btn3.setOnClickListener{
            text += "3"
            binding.mathResult.setText(text)
        }
        binding.btn4.setOnClickListener{
            text += "4"
            binding.mathResult.setText(text)
        }
        binding.btn5.setOnClickListener{
            text += "5"
            binding.mathResult.setText(text)
        }
        binding.btn6.setOnClickListener{
            text += "6"
            binding.mathResult.setText(text)
        }
        binding.btn7.setOnClickListener{
            text += "7"
            binding.mathResult.setText(text)
        }
        binding.btn8.setOnClickListener{
            text += "8"
            binding.mathResult.setText(text)
        }
        binding.btn9.setOnClickListener{
            text += "9"
            binding.mathResult.setText(text)
        }

        binding.btnEquals.setOnClickListener {
            binding.mathResult.setText("")
            when(currentSymbol){
                '+' -> {
                    result += text.toInt()
                }
                '-' -> {
                    result -= text.toInt()
                }
                '*' -> {
                    result *= text.toInt()
                }
                '/' -> {
                    result /= text.toInt()
                }
            }
            text = ""
            binding.mathResult.setText(result.toString())
        }
    }
}