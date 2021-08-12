package com.example.calc_kit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.mariuszgromada.math.mxparser.*;

public class Basic extends AppCompatActivity {
    EditText input;
    TextView result;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        input=findViewById(R.id.input);
        result=findViewById(R.id.result);
        input.setShowSoftInputOnFocus(false);
    }
        private void updateText (String s){
        String old = input.getText().toString();
        int cursorPos = input.getSelectionStart();
        String left = old.substring(0, cursorPos);
        String right = old.substring(cursorPos);
        input.setText(String.format("%s%s%s", left, s, right));
        input.setSelection(cursorPos + s.length());
    }
        public void one (View view){
        updateText(getResources().getString(R.string.oneText));
    }
        public void two (View view){
        updateText(getResources().getString(R.string.twoText));
    }
        public void three (View view){
        updateText(getResources().getString(R.string.threeText));
    }
        public void four (View view){
        updateText(getResources().getString(R.string.fourText));
    }
        public void five (View view){
        updateText(getResources().getString(R.string.fiveText));
    }
        public void six (View view){
        updateText(getResources().getString(R.string.sixText));
    }
        public void seven (View view){
        updateText(getResources().getString(R.string.sevenText));
    }
        public void eight (View view){
        updateText(getResources().getString(R.string.eightText));
    }
        public void nine (View view){
        updateText(getResources().getString(R.string.nineText));
    }
        public void zero (View view){
        updateText(getResources().getString(R.string.zeroText));
    }
        public void open (View view){
        updateText(getResources().getString(R.string.parenthesesOpenText));
        updateText(getResources().getString(R.string.parenthesesCloseText));
        int cursorPos = input.getSelectionStart();
        input.setSelection(cursorPos - 1);
    }
        public void close (View view){
        updateText(getResources().getString(R.string.parenthesesCloseText));
    }
        public void dot (View view){
        updateText(getResources().getString(R.string.decimalText));
    }
        public void add (View view){
        updateText(getResources().getString(R.string.addText));
    }
        public void sub (View view){
        updateText(getResources().getString(R.string.subtractText));
    }
        public void mul (View view){
        updateText(getResources().getString(R.string.multiplyText));
    }
        public void div (View view){
        updateText(getResources().getString(R.string.divideText));
    }
        public void clr (View view){
        input.setText("");
        result.setText("");
    }
        public void equal (View view){
        try {
            String userExp = input.getText().toString();
            input.setText(userExp);
            userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
            userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
            Expression exp = new Expression(userExp);
            String result1 = String.valueOf(exp.calculate());
            if (result1.equalsIgnoreCase("NaN")) {
                Toast.makeText(this, "Wrong input format", Toast.LENGTH_SHORT).show();
            } else {
                result.setText(result1);
            }
            input.setSelection(userExp.length());
        }catch (Exception e){
            Toast.makeText(this, "Wrong input format", Toast.LENGTH_SHORT).show();
        }
    }
        public void back (View view){
        int cursorPos = input.getSelectionStart();
        int textLen = input.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder sel = (SpannableStringBuilder) input.getText();
            sel.replace(cursorPos - 1, cursorPos, "");
            input.setText(sel);
            result.setText("");
            input.setSelection(cursorPos - 1);
        }
    }
}