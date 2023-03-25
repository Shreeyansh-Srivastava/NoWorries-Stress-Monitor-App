package com.example.noworries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity2 extends AppCompatActivity {
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();

        CardView first = findViewById(R.id.r1_card);
        first.setVisibility(View.VISIBLE);

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        TextView stextView1 = (TextView) findViewById(R.id.s1_text);
        TextView stextView2 = (TextView) findViewById(R.id.s2_text);
        TextView stextView3 = (TextView) findViewById(R.id.s3_text);
        TextView stextView4 = (TextView) findViewById(R.id.s4_text);
        TextView stextView5 = (TextView) findViewById(R.id.s5_text);

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);

        CardView s1Card = (CardView) findViewById(R.id.s1_card);
        s1Card.setVisibility(View.INVISIBLE);
        CardView r2Card = (CardView) findViewById(R.id.r2_card);
        r2Card.setVisibility(View.INVISIBLE);
        CardView s2Card = (CardView) findViewById(R.id.s2_card);
        s2Card.setVisibility(View.INVISIBLE);
        CardView r3Card = (CardView) findViewById(R.id.r3_card);
        r3Card.setVisibility(View.INVISIBLE);
        CardView s3Card = (CardView) findViewById(R.id.s3_card);
        s3Card.setVisibility(View.INVISIBLE);
        CardView r4Card = (CardView) findViewById(R.id.r4_card);
        r2Card.setVisibility(View.INVISIBLE);
        CardView s4Card = (CardView) findViewById(R.id.s4_card);
        s4Card.setVisibility(View.INVISIBLE);
        CardView r5Card = (CardView) findViewById(R.id.r5_card);
        r5Card.setVisibility(View.INVISIBLE);
        CardView s5Card = (CardView) findViewById(R.id.s5_card);
        s5Card.setVisibility(View.INVISIBLE);

        Button ButtonretMainActivity = (Button) findViewById(R.id.returnMainActivity);
        ButtonretMainActivity.setVisibility(View.INVISIBLE);
        final int[] c = {0};
        final int[] sy = {0};
        final int[] py = {0};
        final int[] ay = {0};
        final int[] my = {0};
        final int[] wy = {0};
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String Myedittext = editText.getEditableText().toString();
                    if(c[0] ==0)
                    {
                        stextView1.setText(Myedittext);
                        s1Card.setVisibility(View.VISIBLE);
                        r2Card.setVisibility(View.VISIBLE);
                        editText.getText().clear();
                        c[0]++;
                        String Sleep =  Myedittext;
                        //sy[0] = Integer.parseInt(Sleep);
                        if(Sleep.contains("0"))
                        {
                            sy[0]=0;
                        }
                        if(Sleep.contains("1"))
                        {
                            sy[0]=1;
                        }
                        if(Sleep.contains("2"))
                        {
                            sy[0]=2;
                        }
                        if(Sleep.contains("3"))
                        {
                            sy[0]=3;
                        }
                        if(Sleep.contains("4"))
                        {
                            sy[0]=4;
                        }
                        else if(Sleep.contains("5"))
                        {
                            sy[0]=5;
                        }
                        else if(Sleep.contains("6"))
                        {
                            sy[0]=6;
                        }
                        else if(Sleep.contains("7"))
                        {
                            sy[0]=7;
                        }
                        else if(Sleep.contains("8"))
                        {
                            sy[0]=8;
                        }
                        else if(Sleep.contains("9"))
                        {
                            sy[0]=9;
                        }
                        else if(Sleep.contains("10"))
                        {
                            sy[0]=10;
                        }
                    }
                    else if(c[0] ==1)
                    {
                        stextView2.setText(Myedittext);
                        editText.getText().clear();
                        s2Card.setVisibility(View.VISIBLE);
                        r3Card.setVisibility(View.VISIBLE);
                        c[0]++;
                        String phonecallsstress = Myedittext;
                        if(phonecallsstress.contains("yes".toLowerCase()))
                        {
                            py[0]=1;
                        }
                    }
                    else if(c[0] ==2)
                    {
                        stextView3.setText(Myedittext);
                        s3Card.setVisibility(View.VISIBLE);
                        r4Card.setVisibility(View.VISIBLE);
                        editText.getText().clear();
                        c[0]++;
                        String AerobicExercises = Myedittext;
                        if(AerobicExercises.contains("0"))
                        {
                            ay[0]=0;
                        }
                        if(AerobicExercises.contains("1"))
                        {
                            ay[0]=1;
                        }
                        if(AerobicExercises.contains("2"))
                        {
                            ay[0]=2;
                        }
                        if(AerobicExercises.contains("3"))
                        {
                            ay[0]=3;
                        }
                        if(AerobicExercises.contains("4"))
                        {
                            ay[0]=4;
                        }
                        else if(AerobicExercises.contains("5"))
                        {
                            ay[0]=5;
                        }
                        else if(AerobicExercises.contains("6"))
                        {
                            ay[0]=6;
                        }
                        else if(AerobicExercises.contains("7"))
                        {
                            ay[0]=7;
                        }
                        else if(AerobicExercises.contains("8"))
                        {
                            ay[0]=8;
                        }
                        else if(AerobicExercises.contains("9"))
                        {
                            ay[0]=9;
                        }
                        else if(AerobicExercises.contains("10"))
                        {
                            ay[0]=10;
                        }
                    }
                    else if(c[0] ==3)
                    {
                        stextView4.setText(Myedittext);
                        s4Card.setVisibility(View.VISIBLE);
                        r5Card.setVisibility(View.VISIBLE);
                        editText.getText().clear();
                        c[0]++;
                        String MusicEnjoyed = Myedittext;
                        if(MusicEnjoyed.contains("yes".toLowerCase()))
                        {
                            my[0]=1;
                        }
                    }
                    else if(c[0] ==4)
                    {
                        stextView5.setText(Myedittext);
                        s5Card.setVisibility(View.VISIBLE);
                        editText.getText().clear();
                        ButtonretMainActivity.setVisibility(View.VISIBLE);
                        c[0]++;
                        String Workedlatenight = Myedittext;
                        if(Workedlatenight.contains("yes".toLowerCase()))
                        {
                            wy[0]=1;
                        }
                    }
                }
            });

            ButtonretMainActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("Key for sleep",sy[0]);
                    i.putExtra("Key for Phonecall Stress",py[0]);
                    i.putExtra("Key for Aerobic Exercises",ay[0]);
                    i.putExtra("Key for Music Enjoy",my[0]);
                    i.putExtra("Key for workstress",wy[0]);
                    startActivity(i);
                }
            });

    }
}