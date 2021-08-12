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

public class Temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        Spinner tempspin1=findViewById(R.id.tempspin1);
        Spinner tempspin2=findViewById(R.id.tempspin2);
        EditText tempin=findViewById(R.id.tempin);
        TextView tempans=findViewById(R.id.tempans);
        Button tempconv=findViewById(R.id.tempconv);

        String[] temp={"Celsius","Kelvin","Fahrenheit"};
        ArrayAdapter<String> ad1=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,temp);
        tempspin1.setAdapter(ad1);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,temp);
        tempspin2.setAdapter(ad2);

        tempconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double res;
                double amount=Double.parseDouble(tempin.getText().toString());
                if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("celsius") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("kelvin")){
                    res=amount+273.15;
                }
                else if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("celsius") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("fahrenheit")){
                    res=(amount*(9.0/5))+32;
                }
                else if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("kelvin") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("celsius")){
                    res=amount-273.15;
                }
                else if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("kelvin") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("fahrenheit")){
                    res=(amount-273.15)*(9/5.0)+32;
                }
                else if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("fahrenheit") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("celsius")){
                    res=(amount-32)*5/9.0;
                }
                else if(tempspin1.getSelectedItem().toString().equalsIgnoreCase("fahrenheit") && tempspin2.getSelectedItem().toString().equalsIgnoreCase("kelvin")){
                    res=(amount-32)*(5/9.0)+ 273.15;
                }
                else{
                    res=amount;
                }
                String out=""+res;
                tempans.setText(out);
            }catch (Exception e){
                    Toast.makeText(Temperature.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}