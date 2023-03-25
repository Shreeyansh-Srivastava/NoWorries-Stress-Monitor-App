package com.example.noworries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Test_Activity = null;
    Button More = null;
    ProgressBar sleepprogressBar = null;
    ProgressBar Aerobic_Exercises_progressBar = null;
    ProgressBar StressLevelprogressBar = null;
    TextView Stressleveltext;
    TextView Sleeptext;
    TextView Aerobicexercisetext;
    int stresslevel=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        More = (Button) findViewById(R.id.button_for_more);
        getSupportActionBar().hide();
        Bundle extras = getIntent().getExtras();
        Test_Activity = (Button) findViewById(R.id.button);
        sleepprogressBar = (ProgressBar) findViewById(R.id.sleepprogressBar);
        Aerobic_Exercises_progressBar = (ProgressBar) findViewById(R.id.Aerobic_Exercises_Progress_bar);
        StressLevelprogressBar = (ProgressBar) findViewById(R.id.stressllevelprogressBar);
        Stressleveltext = (TextView) findViewById(R.id.Stress_Level_Display);
        Sleeptext = (TextView) findViewById(R.id.Sleep_Display);
        Aerobicexercisetext = (TextView) findViewById(R.id.Aerobics_Display);
        if(extras!=null)
        {
            int Sleep = extras.getInt("Key for sleep");
                if(Sleep<=10) {
                    int percentsleep = Sleep*10;
                    sleepprogressBar.setProgress(percentsleep);
                    stresslevel-=Sleep*2;
                    Sleeptext.setText(String.valueOf(percentsleep));
                }
                else if(Sleep>10){
                    sleepprogressBar.setProgress(100);
                    stresslevel-=20;
                    Sleeptext.setText("100%");
                }
            int Phonecall_stress = extras.getInt("Key for Phonecall Stress");
                if(Phonecall_stress==1){
                    stresslevel+=20;
                }
            int Aerobics_exercises = extras.getInt("Key for Aerobic Exercises");

                if(Aerobics_exercises<=10)
                {
                    int percent_Aerobic_Exercises=Aerobics_exercises*10;
                    Aerobic_Exercises_progressBar.setProgress(percent_Aerobic_Exercises);
                    stresslevel-=Aerobics_exercises*2;
                    Aerobicexercisetext.setText(String.valueOf(percent_Aerobic_Exercises));
                }
            int Music_enjoy = extras.getInt("Key for Music Enjoy");
                if(Music_enjoy==1){
                    stresslevel-=10;
                }
            int workstress = extras.getInt("Key for workstress");
                if(workstress==1){
                    stresslevel+=20;
                }
            StressLevelprogressBar.setProgress(stresslevel);
        }
        else
        {
            Stressleveltext.setText("0");
            Sleeptext.setText("0");
            Aerobicexercisetext.setText("0");

        }
        Stressleveltext.setText(String.valueOf(stresslevel));
        Test_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),MainActivity2.class);
                startActivity(i);
            }
        });
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),SpashscreenActivity.class);
                startActivity(intent);
            }
        });
    }
}