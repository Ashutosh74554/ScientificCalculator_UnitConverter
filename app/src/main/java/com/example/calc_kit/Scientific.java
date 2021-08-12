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

import org.mariuszgromada.math.mxparser.Expression;

public class Scientific extends AppCompatActivity {

    EditText input;
    TextView result;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);

        input=findViewById(R.id.calc);
        result=findViewById(R.id.res);
        input.setShowSoftInputOnFocus(false);

    }
    private void updateText(String s){
        String old=input.getText().toString();
        int cursorPos=input.getSelectionStart();
        String left=old.substring(0, cursorPos);
        String right=old.substring(cursorPos);
        input.setText(String.format("%s%s%s",left,s,right));
        input.setSelection(cursorPos+s.length());
    }
    public void one(View view){
        updateText(getResources().getString(R.string.oneText));
    }
    public void two(View view){
        updateText(getResources().getString(R.string.twoText));
    }
    public void three(View view){
        updateText(getResources().getString(R.string.threeText));
    }
    public void four(View view){
        updateText(getResources().getString(R.string.fourText));
    }
    public void five(View view){
        updateText(getResources().getString(R.string.fiveText));
    }
    public void six(View view){
        updateText(getResources().getString(R.string.sixText));
    }
    public void seven(View view){
        updateText(getResources().getString(R.string.sevenText));
    }
    public void eight(View view){
        updateText(getResources().getString(R.string.eightText));
    }
    public void nine(View view){
        updateText(getResources().getString(R.string.nineText));
    }
    public void zero(View view){
        updateText(getResources().getString(R.string.zeroText));
    }
    public void open(View view){
        updateText(getResources().getString(R.string.parenthesesOpenText));
        updateText(getResources().getString(R.string.parenthesesCloseText));
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void close(View view){
        updateText(getResources().getString(R.string.parenthesesCloseText));
    }
    public void square(View v) {
        updateText("^(2)");
    }
    public void dot(View view){
        updateText(getResources().getString(R.string.decimalText));
    }
    public void add(View view){
        updateText(getResources().getString(R.string.addText));
    }
    public void sub(View view){
        updateText(getResources().getString(R.string.subtractText));
    }
    public void mul(View view){
        updateText(getResources().getString(R.string.multiplyText));
    }
    public void div(View view){
        updateText(getResources().getString(R.string.divideText));
    }
    public void clr(View view){
        input.setText("");
        result.setText("");
    }
    public void sine(View v) {
        updateText("sin()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void cos(View v) {
        updateText("cos()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void tan(View v) {
        updateText("tan()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void asin(View v) {
        updateText("asin()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void acos(View v) {
        updateText("acos()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void atan(View v) {
        updateText("atan()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void piText(View v) {
        updateText("3.1415926536");
    }
    public void eText(View v) { updateText("2.7182818285"); }
    public void logText(View v) {
        updateText("log10()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void lnText(View v) {
        updateText("ln()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void root(View v) {
        updateText("sqrt()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void radian(View v) {
        updateText("rad()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void prime(View v) {
        updateText("ispr()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void xpowy(View v) {
        updateText("^()");
        int cursorPos=input.getSelectionStart();
        input.setSelection(cursorPos-1);
    }
    public void equal(View view){
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
    public void back(View view) {
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