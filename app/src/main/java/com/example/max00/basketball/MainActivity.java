package com.example.max00.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreA;
    TextView scoreB;
    Button B1A;
    Button B2A;
    Button B3A;
    Button B1B;
    Button B2B;
    Button B3B;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = findViewById(R.id.TVscoreA);
        scoreB = findViewById(R.id.TVscoreB);
        B1A = findViewById(R.id.B1A);
        B2A = findViewById(R.id.B2A);
        B3A = findViewById(R.id.B3A);
        B1B = findViewById(R.id.B1B);
        B2B = findViewById(R.id.B2B);
        B3B = findViewById(R.id.B3B);
        reset = findViewById(R.id.Breset);


        B1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreA.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+1;

                scoreA.setText(b+"");
            }
        });

        B2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreA.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+2;
                scoreA.setText(b+"");
            }
        });

        B3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreA.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+3;
                scoreA.setText(b+"");
            }
        });

        B1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreB.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+1;
                scoreB.setText(b+"");
            }
        });

        B2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreB.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+2;
                scoreB.setText(b+"");
            }
        });

        B3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = scoreB.getText().toString();
                Integer a = Integer.parseInt(t);
                Integer b = a+3;
                scoreB.setText(b+"");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = "0";
                scoreA.setText(t);
                scoreB.setText(t);
            }
        });

    }
}
