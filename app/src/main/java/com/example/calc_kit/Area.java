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

public class Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        Spinner areaspin1=findViewById(R.id.areaspin1);
        Spinner areaspin2=findViewById(R.id.areaspin2);
        EditText areain=findViewById(R.id.areain);
        TextView areaans=findViewById(R.id.areaans);
        Button areaconv=findViewById(R.id.areaconv);

        String[] area={"Square metre","Square inch","Square foot", "Square kilometre","Hectare","Acre"};
        ArrayAdapter<String> ad1=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,area);
        areaspin1.setAdapter(ad1);
        ArrayAdapter<String> ad2=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,area);
        areaspin2.setAdapter(ad2);

        areaconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                double amount=Double.parseDouble(areain.getText().toString());
                double res;
                if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square metre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square inch")){
                    res=amount*1550;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square metre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square foot")){
                    res=amount*10.764;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square metre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square kilometre")){
                    res=amount/Math.pow(10,6);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square metre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("hectare")){
                    res=amount/10000.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square metre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("acre")){
                    res=amount/4047;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square inch") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square metre")){
                    res=amount/1550.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square inch") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square foot")){
                    res=amount/144.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square inch") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square kilometre")){
                    res=amount/Math.pow(1.550,9);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square inch") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("hectare")){
                    res=amount/Math.pow(1.550,7);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square inch") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("acre")){
                    res=amount/Math.pow(6.273,6);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square foot") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square metre")){
                    res=amount/10.764;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square foot") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square inch")){
                    res=amount*144;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square foot") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square kilometre")){
                    res=amount/Math.pow(1.0764,7);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square foot") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("hectare")){
                    res=amount/107639.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square foot") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("acre")){
                    res=amount/43560.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square kilometre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square metre")){
                    res=amount*Math.pow(10,6);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square kilometre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square inch")){
                    res=amount*Math.pow(1.55,9);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square kilometre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square foot")){
                    res=amount*Math.pow(1.076,7);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square kilometre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("hectare")){
                    res=amount*100;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("Square kilometre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("acre")){
                    res=amount*247.105;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("hectare") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square metre")){
                    res=amount*10000;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("hectare") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square inch")){
                    res=amount*Math.pow(1.55,7);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("hectare") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square foot")){
                    res=amount*107639;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("hectare") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square kilometre")){
                    res=amount/100.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("hectare") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("acre")){
                    res=amount*2.471;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("acre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square metre")){
                    res=amount*4047;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("acre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square inch")){
                    res=amount*Math.pow(6.273,6);
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("acre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square foot")){
                    res=amount*43560;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("acre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("Square kilometre")){
                    res=amount/247.0;
                }
                else if(areaspin1.getSelectedItem().toString().equalsIgnoreCase("acre") && areaspin2.getSelectedItem().toString().equalsIgnoreCase("hectare")){
                    res=amount/2.471;
                }
                else{
                    res=amount;
                }
                String s=""+res;
                areaans.setText(s);
            }catch (Exception e){
                    Toast.makeText(Area.this, "Wrong input format", Toast.LENGTH_SHORT).show();
                }
        }});
    }
}