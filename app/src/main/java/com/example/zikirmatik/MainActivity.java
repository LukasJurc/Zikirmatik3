package com.example.zikirmatik;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;
    Vibrator vibrator;
    CheckBox cB;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.bt);
        txv =(TextView) findViewById(R.id.tx);
        cB = (CheckBox) findViewById(R.id.cB);
        reset = (Button) findViewById(R.id.rT);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cB.isChecked()) {
                    vibrator.vibrate(80);
                    mCounter ++;
                    txv.setText(Integer.toString(mCounter));
                } else {
                    vibrator.cancel();
                    mCounter ++;
                    txv.setText(Integer.toString(mCounter));
                }}
                 });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.setText(Integer.toString(mCounter=0));
                // and so on...
            }

    });
    }}


