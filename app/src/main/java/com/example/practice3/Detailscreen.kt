package com.example.practice3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        lateinit var MondayMinOutput:TextView
        lateinit var TuesdayMinOutput:TextView
        lateinit var WednesdayMinOutput: TextView
        lateinit var ThursdayMinOutput:TextView
        lateinit var ThursdayMinOutput:TextView
        lateinit var SaturdayMinOutput:TextView
        lateinit var SundayMinOutput:TextView

        lateinit var MondayMaxOutput:TextView
        lateinit var TuesdayMaxOutput:TextView
        lateinit var WednesdayMaxOutput:TextView
        lateinit var ThursdayMaxOutput:TextView
        lateinit var FridayMaxOutput:TextView
        lateinit var SaturdayMaxOutput:TextView
        lateinit var SaturdayMaxOutput:TextView

        lateinit var MondayConditionOutput:TextView
        lateinit var TuesdayConditionOutput:TextView
        lateinit var WednesdayConditionOutput:TextView
        lateinit var ThursdayConditionOutput:TextView
        lateinit var FridayConditionOutput:TextView
        lateinit var SaturdayConditionOutput:TextView
        lateinit var SundayConditionOutput:TextView

        lateinit var btnBacktomain: Button




        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailscreen)


        MondayMinOutput
         TuesdayMinOutput
         WednesdayMinOutput
         ThursdayMinOutput
         ThursdayMinOutput
         SaturdayMinOutput
        SundayMinOutput

       MondayMaxOutput
         TuesdayMaxOutput
         WednesdayMaxOutput
        ThursdayMaxOutput
         FridayMaxOutput
         SaturdayMaxOutput
       SaturdayMaxOutput

      MondayConditionOutput
         TuesdayConditionOutput
         WednesdayConditionOutput
         ThursdayConditionOutput
         FridayConditionOutput
         SaturdayConditionOutput
         SundayConditionOutput

         btnBacktomain


    }
}