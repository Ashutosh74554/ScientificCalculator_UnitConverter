package com.example.calc_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button basic,sci,unit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout con=findViewById(R.id.main_anim);
        AnimationDrawable anim=(AnimationDrawable) con.getBackground();
        anim.setEnterFadeDuration(2500);
        anim.setExitFadeDuration(5000);
        anim.start();

        basic=findViewById(R.id.basic);
        sci=findViewById(R.id.sci);
        unit=findViewById(R.id.unit);
        Intent intent=new Intent(this, Basic.class);
        Intent intent1=new Intent(this, Scientific.class);
        Intent intent2=new Intent(this, Unit.class);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening Basic Calculator...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening Scientific Calculator...", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });
        unit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opening Unit Converter...", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });
    }
}