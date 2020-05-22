package com.shadowos.agrifarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class shadowact2 extends AppCompatActivity {
    private WebView webView;
    private ImageView viewv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.shadowos.agrifarm.R.layout.activity_shadowact2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        Glide.with(this).asGif().load(R.drawable.giphy3).into(imageView);
        webView = (WebView) findViewById(R.id.wewewew);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.covid19india.org/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ImageView viewv = (ImageView) findViewById(R.id.imageView6);
        Glide.with(this).asGif().load(R.drawable.sourcecode2).into(viewv);

    }


    public void farmnews(View view) {
        Intent intent = new Intent(this, shadowact4.class);
        startActivity(intent);
    }

    public void infopesticides(View view) {
        Intent intent = new Intent(this, shadowact5.class);
        startActivity(intent);


    }

    public void infofertilisers(View view) {
        Intent intent = new Intent(this, shadowact6.class);
        startActivity(intent);

    }

    public void seedinfo(View view) {
        Intent intent = new Intent(this, shadowact7.class);
        startActivity(intent);
    }

    public void sourcecode(View view) {
        Intent intent = new Intent(this, shadowact8.class);
        startActivity(intent);


    }
}