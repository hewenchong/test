package com.example.mytext.activity;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class main extends AppCompatActivity {


    RadioButton r1=null;
    RadioButton r2=null;
    RadioButton r3=null;
    RadioButton r4=null;
    RadioGroup radioGroup=null;
    RadioButton currentRadioButton=null;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r2=(RadioButton) findViewById(R.id.radioButton2);
        r3=(RadioButton) findViewById(R.id.radioButton3);
        r4=(RadioButton) findViewById(R.id.radioButton4);
        r1.setClickable(true);
        //radioGroup.setOnCheckedChangeListener(mChangeRadio);
        Button btn1_sure=(Button)findViewById(R.id.sure);
        Button btn2_cancel=(Button)findViewById(R.id.cancel);
        btn1_sure.setOnClickListener(new btn1_sure());
        btn2_cancel.setOnClickListener(new btn2_cancel());
    }
    class btn1_sure implements View.OnClickListener {
        @Override
        public void onClick(View v){
            if(currentRadioButton.getText().equals("in")){
                setTitle("你选择的答案是正确的！");
            }
            else{
                setTitle("你选择的答案是错误的！");
            }
        }
    }
    class btn2_cancel implements View.OnClickListener {
        @Override
        public void onClick(View v){
            radioGroup.clearCheck();
            setTitle("");
        }
    }
    private RadioGroup.OnCheckedChangeListener mChangeRadio = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == r1.getId()) {
                // 获得按钮的名称
                currentRadioButton = r1;
            } else if (checkedId == r2.getId()) {
                currentRadioButton = r2;
            } else if (checkedId == r3.getId()) {
                currentRadioButton = r3;
            } else if (checkedId == r4.getId()) {
                currentRadioButton = r4;
            }
        }
    };
}
