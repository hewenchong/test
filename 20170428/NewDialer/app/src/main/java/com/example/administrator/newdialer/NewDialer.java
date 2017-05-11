package com.example.administrator.newdialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class NewDialer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View b){
                //Intent <Intent_name>=new Intent (<Action>,<Data>);
                Intent I = new Intent(Intent.ACTION_DIAL,Uri.parse("tel://13160666603"));
                startActivity(I);
            }
        });
    }
}
