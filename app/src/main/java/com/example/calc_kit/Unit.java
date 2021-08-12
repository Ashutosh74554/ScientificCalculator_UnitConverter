package com.example.calc_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Unit extends AppCompatActivity {

    CardView currency, weight, time, length, area, temperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        currency=findViewById(R.id.currency);
        weight=findViewById(R.id.weight);
        time=findViewById(R.id.time);
        length=findViewById(R.id.length);
        area=findViewById(R.id.area);
        temperature=findViewById(R.id.temperature);

        Intent intent=new Intent(this,Currency.class);
        Intent intent1=new Intent(this,Weight.class);
        Intent intent2=new Intent(this,Time.class);
        Intent intent3=new Intent(this,Length.class);
        Intent intent4=new Intent(this,Area.class);
        Intent intent5=new Intent(this,Temperature.class);

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent3);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent4);
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent5);
            }
        });
    }
}