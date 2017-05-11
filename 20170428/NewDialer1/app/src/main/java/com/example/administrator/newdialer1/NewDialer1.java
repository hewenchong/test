package com.example.administrator.newdialer1;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewDialer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText phoneNum=(EditText)findViewById(R.id.phoneNum);
        final Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View b){
                //Intent <Intent_name>=new Intent (<Action>,<Data>);
                String call=phoneNum.getText().toString();
                if(PhoneNumberUtils.isGlobalPhoneNumber(call)){
                    Intent I = new Intent(Intent.ACTION_CALL, Uri.parse("tel://" + call));
                    //Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse(tel"://"+call));
                    startActivity(I);
                }
                else{
                    Toast.makeText(NewDialer1.this,"您输入的号码不正确，请重新输入！", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
