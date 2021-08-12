package com.example.calc_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Spinner timespin1=findViewById(R.id.timespin1);
        Spinner timespin2=findViewById(R.id.timespin2);
        EditText timein=findViewById(R.id.timein);
        TextView timeans=findViewById(R.id.timeans);
        Button timeconv=findViewById(R.id.timeconv);

        String[] time={"Seconds","Minutes","Hours","Days"};
        ArrayAdapter<String> ad1=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,time);
        timespin1.setAdapter(ad1);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,time);
        timespin2.setAdapter(ad2);

        timeconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double tot;
                int amount=Integer.parseInt(timein.getText().toString());
                if(timespin1.getSelectedItem().toString().equalsIgnoreCase("seconds") && timespin2.getSelectedItem().toString().equalsIgnoreCase("Minutes")) {
                    tot = amount / 60.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("seconds") && timespin2.getSelectedItem().toString().equalsIgnoreCase("Hours")) {
                    tot = amount / 3600.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("seconds") && timespin2.getSelectedItem().toString().equalsIgnoreCase("days")) {
                    tot = amount / 86400.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("minutes") && timespin2.getSelectedItem().toString().equalsIgnoreCase("seconds")){
                    tot=amount*60.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("minutes") && timespin2.getSelectedItem().toString().equalsIgnoreCase("hours")){
                    tot=amount/60.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("minutes") && timespin2.getSelectedItem().toString().equalsIgnoreCase("days")){
                    tot=amount/1440.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("hours") && timespin2.getSelectedItem().toString().equalsIgnoreCase("seconds")){
                    tot=amount*3600.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("hours") && timespin2.getSelectedItem().toString().equalsIgnoreCase("minutes")){
                    tot=amount*60.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("hours") && timespin2.getSelectedItem().toString().equalsIgnoreCase("days")){
                    tot=amount/24.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("days") && timespin2.getSelectedItem().toString().equalsIgnoreCase("seconds")){
                    tot=amount*86400.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("days") && timespin2.getSelectedItem().toString().equalsIgnoreCase("minutes")){
                    tot=amount*1440.0;
                }
                else if(timespin1.getSelectedItem().toString().equalsIgnoreCase("days") && timespin2.getSelectedItem().toString().equalsIgnoreCase("hours")){
                    tot=amount*24.0;
                }
                else
                    tot=amount;
                String res=""+tot;
                timeans.setText(res);
            }catch (Exception e){
                    Toast.makeText(Time.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}