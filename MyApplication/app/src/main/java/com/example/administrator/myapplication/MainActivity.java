package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    private String url = null;
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (WebView)findViewById(R.id.webview);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText2);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setAppCacheEnabled(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.setWebViewClient(webViewClient);


     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
                     String info = String.valueOf(editText.getText());
                     if(info.equals("123")){
                         url =  "http://www.zhbit.com/";
                         webview.loadUrl(url);
                        Toast.makeText(MainActivity.this,"连接成功",Toast.LENGTH_LONG).show();;


                     }else{
                         Toast.makeText(MainActivity.this,"连接失败",Toast.LENGTH_LONG).show();
                     }
         }
     });

    }

    WebViewClient webViewClient = new WebViewClient(){
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(url);
            return true;
        }
    };

    

}
