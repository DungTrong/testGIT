package com.example.b1_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate('+');
            }
        });
        findViewById(R.id.btnSub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate('-');
            }
        }); findViewById(R.id.btnMul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate('*');
            }
        });
        findViewById(R.id.btnDiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculate('/');
            }
        });
    }
    private void caculate(char phepTinh){
        EditText txtResult =(EditText) findViewById(R.id.txtResult);
        EditText txtNumber1 = (EditText)  findViewById(R.id.number1);
        EditText txtNumber2 = (EditText)  findViewById(R.id.number2);
        double number1 = Double.parseDouble(txtNumber1.getText().toString());
        double number2 = Double.parseDouble(txtNumber2.getText().toString());
        txtResult.setText(number1+number2+"");
        switch (phepTinh){
            case '+':{
                txtResult.setText(number1+number2+"");
                break;
            }
            case '-':{
                txtResult.setText(number1-number2+"");
                break;
            } case '*':{
                txtResult.setText(number1*number2+"");
                break;
            }
            case '/':{
                txtResult.setText(number1/number2+"");
                break;
            }
        }
    }
}