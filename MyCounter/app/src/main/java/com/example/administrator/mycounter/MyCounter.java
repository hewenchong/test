package com.example.administrator.mycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyCounter extends AppCompatActivity {
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point;
    Button btn_equal;
    Button btn_clear;
    Button btn_del;
    Button btn_minus;
    Button btn_plus;
    Button btn_divide;
    Button btn_multiply;
    TextView input;
    boolean clear_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_point = (Button)findViewById(R.id.btn_point);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_del = (Button)findViewById(R.id.btn_del);
        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        input = (TextView) findViewById(R.id.input);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);

            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString();
                clear_flag = false;
                str = "";
                input.setText("");
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString();
                if (clear_flag){
                    clear_flag = false;
                    str = "";
                    input.setText("");
                }else if (str!=null&& !str.equals("")){
                    input.setText(str.substring(0,str.length()-1));
                }
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString();
                if(clear_flag){
                    clear_flag = false;
                    str = "";
                    input.setText("");
                }
                input.setText(str +""+ ((Button)v).getText()+"");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
            }
        });
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString().trim();
                str = str + String.valueOf(((Button)v).getText());
                input.setText(str);
                getResult();
            }
        });
        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = input.getText().toString();
                if(clear_flag){
                    clear_flag = false;
                    str = "";
                    input.setText("");
                }
                input.setText(str + ((Button)v).getText());


            }
        });

    }

    private void getResult(){
        String exp = input.getText().toString();
        if (exp == null||exp.equals("")){
            return;
        }
        if (!exp.contains("")){
            return;
        }
        if (clear_flag){
            clear_flag = false;
            return;
        }
        clear_flag = true;
        double result = 0;
        String s1 = exp.substring(0,exp.indexOf(""));
        String op = exp.substring(exp.indexOf("")+1,exp.indexOf("")+2);
        String s2 = exp.substring(exp.indexOf("")+3);
        if(!s1.equals("")&&!s2.equals("")){
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if(op.equals("+")){
                result = d1 + d2;
            }else if(op.equals("-")){
                result = d1 - d2;
            }else if (op.equals("*")){
                result = d1 * d2;
            }else if (op.equals("/")){
                result = d1 / d2;
            }
        }
        if(s1.contains(".")&&s2.contains(".")){
            int r = (int)result;
            input.setText(r + "");
        }else {
            input.setText(result + "");
        }
        if(!s1.equals("")&&s2.equals("")){
            input.setText(exp);
        }else if(s1.equals("")&&!s2.equals("")){
            double d2 = Double.parseDouble(s2);
            if(op.equals("+")){
                result = 0 + d2;
            }else if(op.equals("-")){
                result = 0 - d2;
            }else if(op.equals("*")){
                result = 0;
            }else if(op.equals("/")){
                result = 0;
            }
            if(s2.contains(".")){
                int r = (int)result;
                input.setText(r+"");
            }else {
                input.setText(result+"");
            }
        }else {
            input.setText("");
        }
    }
}
