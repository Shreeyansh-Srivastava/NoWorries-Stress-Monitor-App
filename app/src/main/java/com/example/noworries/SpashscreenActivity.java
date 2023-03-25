package com.example.noworries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SpashscreenActivity extends AppCompatActivity {

    Button buttonaboutnmhp = null;
    Button buttonaboutlllf = null;
    Button buttonforyt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spashscreen);
        buttonaboutnmhp = (Button) findViewById(R.id.buttonaboutnmhp);
        buttonaboutlllf = (Button) findViewById(R.id.buttonaboutlllf);
        buttonforyt = (Button) findViewById(R.id.buttonforyt);

        buttonaboutnmhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nhm.gov.in/index1.php?lang=1&level=2&sublinkid=1043&lid=359"));
                startActivity(intent);

            }
        });
        buttonaboutlllf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thelivelovelaughfoundation.org/helpline"));
            startActivity(intent);
            }
        });
        buttonforyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=meWOGCm215c"));
            startActivity(intent);
            }
        });
    }
}