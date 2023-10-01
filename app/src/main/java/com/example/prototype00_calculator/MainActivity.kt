package com.example.prototype00_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var addButton: Button
    private lateinit var subtractButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)
        addButton = findViewById(R.id.addButton)
        subtractButton = findViewById(R.id.subtractButton)
        resultTextView = findViewById(R.id.resultTextView)

        addButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toInt()
            val num2 = secondNumber.text.toString().toInt()
            val result = num1 + num2
            resultTextView.text = "Result: $result"


        }
        subtractButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toInt()
            val num2 = secondNumber.text.toString().toInt()
            val result = num1 - num2
            resultTextView.text = "Result: $result"
        }
    }
}