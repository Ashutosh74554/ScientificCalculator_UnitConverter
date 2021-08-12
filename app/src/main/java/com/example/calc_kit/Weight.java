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

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        Spinner weightspin1=findViewById(R.id.weightspin1);
        Spinner weightspin2=findViewById(R.id.weightspin2);
        EditText weightin=findViewById(R.id.weightin);
        TextView weightans=findViewById(R.id.weightans);
        Button weightconv=findViewById(R.id.weightconv);

        String[] weight={"Grams","Kilograms","Ounces","Pounds","Tonnes"};
        ArrayAdapter<String> ad1=new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,weight);
        weightspin1.setAdapter(ad1);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,weight);
        weightspin2.setAdapter(ad2);

        weightconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double amount=Double.parseDouble(weightin.getText().toString());
                double res;
                if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("grams") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("Kilograms")){
                    res=amount/1000.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("grams") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("ounces")){
                    res=amount/28.35;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("grams") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("pounds")){
                    res=amount/454.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("grams") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("tonnes")){
                    res=amount/Math.pow(10,6);
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("kilograms") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("grams")){
                    res=amount*1000;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("kilograms") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("ounces")){
                    res=amount*35.274;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("kilograms") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("pounds")){
                    res=amount*2.205;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("kilograms") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("tonnes")){
                    res=amount/1000.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("ounces") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("grams")){
                    res=amount*28.35;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("ounces") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("kilograms")){
                    res=amount/35.274;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("ounces") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("pounds")){
                    res=amount/16.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("ounces") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("tonnes")){
                    res=amount/35274.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("pounds") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("grams")){
                    res=amount*454;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("pounds") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("kilograms")){
                    res=amount/2.205;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("pounds") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("ounces")){
                    res=amount*16;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("pounds") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("tonnes")){
                    res=amount/2205.0;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("tonnes") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("grams")){
                    res=amount*Math.pow(10,6);
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("tonnes") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("kilograms")){
                    res=amount*1000;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("tonnes") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("ounces")){
                    res=amount*35274;
                }
                else if(weightspin1.getSelectedItem().toString().equalsIgnoreCase("tonnes") && weightspin2.getSelectedItem().toString().equalsIgnoreCase("pounds")){
                    res=amount*2205;
                }
                else{
                    res=amount;
                }
                String s=""+res;
                weightans.setText(s);
            }catch (Exception e){
                    Toast.makeText(Weight.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}