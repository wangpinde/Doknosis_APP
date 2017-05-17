package com.doknosis.doknosis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageButton button0;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.imageView);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.r3);
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.r2);
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.r1);
            }
        });
        button0 = (ImageButton) findViewById(R.id.imageButton);
        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.r0);
            }
        });
    }
}
