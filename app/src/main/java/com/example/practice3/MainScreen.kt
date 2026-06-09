package com.example.practice3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    lateinit var btnTemeratureAverage: Button
    lateinit var AverageOutput: TextView
    lateinit var btnExit2:Button
    lateinit var btnNext:Button
    lateinit var btnClear:Button

    lateinit var MondayTemperatureInput:EditText
    lateinit var TuesdayTemperatureInput:EditText
    lateinit var WednesdayTemperatureInput:EditText
    lateinit var ThursdayTemperatureInput:EditText
    lateinit var FridayTemperatureInput:EditText
    lateinit var SaturdayTemperatureInput:EditText
    lateinit var SundayTemperatureInput: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        btnTemeratureAverage = findViewById(R.id.btnTemeratureAverage)
        AverageOutput = findViewById(R.id.AverageOutput)
        btnExit2 = findViewById(R.id.btnExit2)
        btnNext = findViewById(R.id.btnNext)
        btnClear = findViewById(R.id.btnClear)

        MondayTemperatureInput = findViewById(R.id.MondayTemperatureInput)
        TuesdayTemperatureInput = findViewById(R.id.TuesdayTemperatureInput)
        WednesdayTemperatureInput = findViewById(R.id.WednesdayTemperatureInput)
        ThursdayTemperatureInput = findViewById(R.id.ThursdayTemperatureInput)
        FridayTemperatureInput = findViewById(R.id.FridayTemperatureInput)
        SaturdayTemperatureInput = findViewById(R.id.SaturdayTemperatureInput)
        SundayTemperatureInput = findViewById(R.id.SundayTemperatureInput)


        btnTemeratureAverage.setOnClickListener {

            val temperatureInputs = arrayOf(
                MondayTemperatureInput,
                TuesdayTemperatureInput,
                WednesdayTemperatureInput,
                ThursdayTemperatureInput,
                FridayTemperatureInput,
                SaturdayTemperatureInput,
                SundayTemperatureInput
            )

            var totalSum = 0.0
            var validCount = 0
            var hasEmptyFields = false

            for (inputField in temperatureInputs) {
                val inputString = inputField.text.toString().trim()

                if (inputString.isNotEmpty()) {
                    val tempValue = inputString.toDoubleOrNull()
                    if (tempValue != null) {
                        totalSum += tempValue
                        validCount++
                    }


                } else {
                    hasEmptyFields = true
                }
            }


                    if (hasEmptyFields) {
                        Toast.makeText(this, "ENTER VALUES FOR ALL DAYS", Toast.LENGTH_SHORT).show()

                    }
                    if (validCount > 0) {

                        val weeklyAverage = totalSum / validCount
                        AverageOutput.text = String.format("%.1f celcius ", weeklyAverage)

                    } else {
                        AverageOutput.text = "0.0 celcius"
                        Toast.makeText(
                            this,
                            "enter atleast one valid temperature",
                            Toast.LENGTH_SHORT
                        ).show()

                    }



            btnExit2.setOnClickListener {
                finishAffinity()


            }
            btnNext.setOnClickListener {

                val intent = Intent(this, Detailscreen::class.java)
                startActivity(intent)


            }
            btnClear.setOnClickListener {
                val temperatureInputs = arrayOf(
                    MondayTemperatureInput,
                    TuesdayTemperatureInput,
                    WednesdayTemperatureInput,
                    ThursdayTemperatureInput,
                    FridayTemperatureInput,
                    SaturdayTemperatureInput,
                    SundayTemperatureInput
                )

                for (inputField in temperatureInputs) {
                    inputField.text.clear()
                    AverageOutput.text = ""


                }

            }
        }
        }}