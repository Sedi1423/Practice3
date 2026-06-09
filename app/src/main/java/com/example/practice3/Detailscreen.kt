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
        lateinit var SaturdayMinOutput:TextView
        lateinit var SundayMinOutput:TextView

        lateinit var MondayMaxOutput:TextView
        lateinit var TuesdayMaxOutput:TextView
        lateinit var WednesdayMaxOutput:TextView
        lateinit var ThursdayMaxOutput:TextView
        lateinit var FridayMaxOutput:TextView
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


        MondayMinOutput=findViewById(R.id.MondayMinOutput)
         TuesdayMinOutput=findViewById(R.id.TuesdayMinOutput)
         WednesdayMinOutput=findViewById(R.id.WednesdayMinOutput)
         ThursdayMinOutput=findViewById(R.id.)
         ThursdayMinOutput=findViewById(R.id.)
         SaturdayMinOutput=findViewById(R.id.)
        SundayMinOutput=findViewById(R.id.)

       MondayMaxOutput=findViewById(R.id.)
         TuesdayMaxOutput=findViewById(R.id.)
         WednesdayMaxOutput=findViewById(R.id.)
        ThursdayMaxOutput=findViewById(R.id.)
         FridayMaxOutput=findViewById(R.id.)
         SaturdayMaxOutput=findViewById(R.id.)
       SaturdayMaxOutput=findViewById(R.id.)

      MondayConditionOutput=findViewById(R.id.)
         TuesdayConditionOutput=findViewById(R.id.)
         WednesdayConditionOutput=findViewById(R.id.)
         ThursdayConditionOutput=findViewById(R.id.)
         FridayConditionOutput=findViewById(R.id.)
         SaturdayConditionOutput=findViewById(R.id.)
         SundayConditionOutput=findViewById(R.id.)

         btnBacktomain=findViewById(R.id.)


    }
}