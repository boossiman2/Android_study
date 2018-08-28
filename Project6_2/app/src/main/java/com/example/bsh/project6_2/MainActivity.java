package com.example.bsh.project6_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUrl = (EditText)findViewById(R.id.edtUr1);
        btnGo = (Button)findViewById(R.id.btnGo);
        btnBack = (Button)findViewById(R.id.btnBack);
        web = (WebView)findViewById(R.id.webView1);
    }
    class CookWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}