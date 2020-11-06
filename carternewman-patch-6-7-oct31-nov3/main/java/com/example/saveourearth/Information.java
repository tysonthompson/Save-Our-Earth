package com.example.saveourearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {

    Button interviewButton, fiveRsButton, electricCarsButton, dailyLifeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        interviewButton = (Button) findViewById(R.id.interviewButton);//get id of interviewButton
        fiveRsButton = (Button) findViewById(R.id.fiveRsButton);//get id of fiveRsButton
        electricCarsButton = (Button) findViewById(R.id.electricCarsButton);//get id of electricCarsButton
        dailyLifeButton = (Button) findViewById(R.id.dailyLifeButton);//get id of dailyLifeButton

        interviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInterviewActivity();
            }
        });
        fiveRsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThe5rsActivity();
            }
        });
        electricCarsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openElectricCarsActivity();
            }
        });
        dailyLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDailyLifeActivity();
            }
        });
    }
    public void openInterviewActivity(){
        Intent intent = new Intent(this, Interview.class);
        startActivity(intent);
    }
    public void openThe5rsActivity(){
        Intent intent = new Intent(this, The5rs.class);
        startActivity(intent);
    }
    public void openElectricCarsActivity(){
        Intent intent = new Intent(this, ElectricCars.class);
        startActivity(intent);
    }public void openDailyLifeActivity(){
        Intent intent = new Intent(this, DailyLife.class);
        startActivity(intent);
    }

}