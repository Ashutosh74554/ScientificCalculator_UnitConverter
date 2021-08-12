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

public class Length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        Spinner lengthspin1=findViewById(R.id.lengthspin1);
        Spinner lengthspin2=findViewById(R.id.lengthspin2);
        EditText lengthin=findViewById(R.id.lengthin);
        TextView lengthans=findViewById(R.id.lengthans);
        Button lengthconv=findViewById(R.id.lenconv);

        String[] length={"Millimetres","Centimetres","Kilometres","Metres","Inches","Feet","Miles"};
        ArrayAdapter<String> ad1=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,length);
        lengthspin1.setAdapter(ad1);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,length);
        lengthspin2.setAdapter(ad2);

        lengthconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double res;
                double amount=Double.parseDouble(lengthin.getText().toString());
                if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount/10.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount/1000000.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount/1000.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount/25.4;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount/305.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("millimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/Math.pow(1.609,6);
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*10;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount/100000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount/100;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount/2.54;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount/30.48;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("centimetres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/160934.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*1000000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount*100000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount*1000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount*39370;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount*3281;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("kilometres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/1.609;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*1000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount*100;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount/1000;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount*39.37;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount*3.281;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("metres") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/1609;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*25.4;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount*2.54;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount/39370;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount/39.37;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount/12;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("inches") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/63360;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*305;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount*30.48;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount*305;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount/3.281;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount*12;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("feet") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("miles")){
                    res=amount/5280.0;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("millimetres")){
                    res=amount*Math.pow(1.609,6);
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("centimetres")){
                    res=amount*160934;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("kilometres")){
                    res=amount*1.6093;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("metres")){
                    res=amount*1609.3;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("inches")){
                    res=amount*63360;
                }
                else if(lengthspin1.getSelectedItem().toString().equalsIgnoreCase("miles") && lengthspin2.getSelectedItem().toString().equalsIgnoreCase("feet")){
                    res=amount*160934;
                }
                else{
                    res=amount;
                }
                String fin=""+res;
                lengthans.setText(fin);
            }catch (Exception e){
                    Toast.makeText(Length.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}