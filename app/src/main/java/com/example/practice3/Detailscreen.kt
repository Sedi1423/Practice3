package com.example.practice3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailscreen : AppCompatActivity() {


    lateinit var MondayMinOutput: TextView
    lateinit var TuesdayMinOutput:TextView
    lateinit var WednesdayMinOutput: TextView
    lateinit var ThursdayMinOutput:TextView
    lateinit var FridayMinOutput:TextView

    lateinit var SaturdayMinOutput:TextView
    lateinit var SundayMinOutput:TextView

    lateinit var MondayMaxOutput:TextView
    lateinit var TuesdayMaxOutput:TextView
    lateinit var WednesdayMaxOutput:TextView
    lateinit var ThursdayMaxOutput:TextView
    lateinit var FridayMaxOutput:TextView
    lateinit var SaturdayMaxOutput:TextView
    lateinit var SundayMaxOutput:TextView

    lateinit var MondayConditionOutput:TextView
    lateinit var TuesdayConditionOutput:TextView
    lateinit var WednesdayConditionOutput:TextView
    lateinit var ThursdayConditionOutput:TextView
    lateinit var FridayConditionOutput:TextView
    lateinit var SaturdayConditionOutput:TextView
    lateinit var SundayConditionOutput:TextView

    lateinit var btnBacktomain: Button

    override fun onCreate(savedInstanceState: Bundle?) {




        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailscreen)




        MondayMinOutput=findViewById(R.id.MondayMinOutput)
         TuesdayMinOutput=findViewById(R.id.TuesdayMinOutput)
         WednesdayMinOutput=findViewById(R.id.WednesdayMinOutput)
         ThursdayMinOutput=findViewById(R.id.ThursdayMinOutput)
         FridayMinOutput=findViewById(R.id.ThursdayMinOutput)
         SaturdayMinOutput=findViewById(R.id.SaturdayMinOutput)
        SundayMinOutput=findViewById(R.id.SundayMinOutput)



        MondayMaxOutput=findViewById(R.id.MondayMaxOutput)
        TuesdayMaxOutput=findViewById(R.id.TuesdayMaxOutput)
        WednesdayMaxOutput=findViewById(R.id.WednesdayMaxOutput)
        ThursdayMaxOutput=findViewById(R.id.ThursdayMaxOutput)
        FridayMaxOutput=findViewById(R.id.FridayMaxOutput)
        SaturdayMaxOutput=findViewById(R.id.SaturdayMaxOutput)
        SundayMaxOutput=findViewById(R.id.SundayMaxOutput)





      MondayConditionOutput=findViewById(R.id.MondayConditionOutput)
         TuesdayConditionOutput=findViewById(R.id.TuesdayConditionOutput)
         WednesdayConditionOutput=findViewById(R.id.WednesdayConditionOutput)
         ThursdayConditionOutput=findViewById(R.id.ThursdayConditionOutput)
         FridayConditionOutput=findViewById(R.id.FridayConditionOutput)
         SaturdayConditionOutput=findViewById(R.id.SaturdayConditionOutput)
         SundayConditionOutput=findViewById(R.id.SundayConditionOutput)

         btnBacktomain=findViewById(R.id.btnBacktomain)

        val minTextViews = arrayOf(MondayConditionOutput,
                TuesdayConditionOutput,
                WednesdayConditionOutput,
                ThursdayConditionOutput,
                FridayConditionOutput,
                SaturdayConditionOutput,
                SundayConditionOutput)
         val maxTextViews= arrayOf(MondayConditionOutput,
             TuesdayConditionOutput,
             WednesdayConditionOutput,
             ThursdayConditionOutput,
             FridayConditionOutput,
             SaturdayConditionOutput,
             SundayConditionOutput)
        val conditionTextViews= arrayOf(MondayConditionOutput,
            TuesdayConditionOutput,
            WednesdayConditionOutput,
            ThursdayConditionOutput,
            FridayConditionOutput,
            SaturdayConditionOutput,
            SundayConditionOutput)

        val arrayDays=arrayListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        val arrayMinTemps=arrayOf(12,10,8,11,9,14,13)
        val arrayMaxTemp=arrayOf(22,19,17,21,20,24,25)
        val arrayConditions=arrayOf("Sunny","Cloudy","Rainy","Windy","Sunny","Clear","Sunny")

        for(i in arrayDays.indices){
            minTextViews[i].text=String.format("%d celcius",arrayMinTemps[i])
            maxTextViews[i].text=String.format("%d celcius",arrayMaxTemp[i])
            conditionTextViews[i].text=arrayConditions[i]

            btnBacktomain.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }

        }


    }
}