package com.example.saveourearth;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button informationButton, mapButton, creditsButton, tutorialButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        informationButton = (Button) findViewById(R.id.informationButton);//get id of informationButton
        mapButton = (Button) findViewById(R.id.mapButton);//get id of mapButton
        creditsButton = (Button) findViewById(R.id.creditsButton);//get id of creditsButton
        tutorialButton = (Button) findViewById(R.id.tutorialButton);//get id of tutorialButton

        informationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInformationActivity();
            }
        });
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMapActivity();
            }
        });
        creditsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreditsActivity();
            }
        });
        tutorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTutorialActivity();
            }
        });

    }

    public void openInformationActivity(){
        Intent intent = new Intent(this, Information.class);
        startActivity(intent);
    }
    public void openMapActivity(){
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }
    public void openCreditsActivity(){
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }
    public void openTutorialActivity(){
        Intent intent = new Intent(this, Tutorial.class);
        startActivity(intent);
    }
}