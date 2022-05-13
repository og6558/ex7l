package com.example.ex7l;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV;
    String stringUrl;
    EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV = (WebView) findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl(stringUrl);
        wV.setWebViewClient(new MyWebViewClient());
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
    }

    public void go(View view) {
        stringUrl = editTextTextPersonName.getText().toString();
        wV.loadUrl(stringUrl);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
            }
        }

    }
