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

public class Currency extends AppCompatActivity {

    Spinner currspin1,currspin2;
    EditText currin;
    TextView currans;
    Button currconv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        currspin1=findViewById(R.id.currspin1);
        currspin2=findViewById(R.id.currspin2);
        currans=findViewById(R.id.currans);
        currin=findViewById(R.id.currin);
        currconv=findViewById(R.id.currconv);

        String[] curr ={"US Dollars", "Indian Rupees", "Euro"};
        ArrayAdapter <String> ad1= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,curr);
        currspin1.setAdapter(ad1);
        ArrayAdapter <String> ad2= new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,curr);
        currspin2.setAdapter(ad2);

        currconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double res;
                double amount=Double.parseDouble(currin.getText().toString());
                if(currspin1.getSelectedItem().toString().equalsIgnoreCase("US dollars") && currspin2.getSelectedItem().toString().equalsIgnoreCase("indian rupees")) {
                    res = amount * 74.24;
                }
                else if(currspin1.getSelectedItem().toString().equalsIgnoreCase("US dollars") && currspin2.getSelectedItem().toString().equalsIgnoreCase("euro")) {
                    res = amount * 0.84;
                }
                else if(currspin1.getSelectedItem().toString().equalsIgnoreCase("indian rupees") && currspin2.getSelectedItem().toString().equalsIgnoreCase("us dollars")) {
                    res = amount / 74.24;
                }
                else if(currspin1.getSelectedItem().toString().equalsIgnoreCase("indian rupees") && currspin2.getSelectedItem().toString().equalsIgnoreCase("euro")) {
                    res = amount * 0.11;
                }
                else if(currspin1.getSelectedItem().toString().equalsIgnoreCase("euro") && currspin2.getSelectedItem().toString().equalsIgnoreCase("us dollars")) {
                    res = amount / 0.84;
                }
                else if(currspin1.getSelectedItem().toString().equalsIgnoreCase("euro") && currspin2.getSelectedItem().toString().equalsIgnoreCase("indian rupees")) {
                    res = amount / 0.11;
                }
                else{
                    res=amount;
                }
                String fin=""+res;
                currans.setText(fin);
            }catch (Exception e){
                    Toast.makeText(Currency.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}