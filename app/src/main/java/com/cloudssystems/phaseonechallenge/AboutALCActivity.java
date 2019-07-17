package com.cloudssystems.phaseonechallenge;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class AboutALCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        getSupportActionBar().setTitle("About ACL");
        WebView myWebView = (WebView) findViewById(R.id.webView);
        // Enable Javascript to run in WebView
        myWebView.getSettings().setJavaScriptEnabled(true);

        // Allow Zoom in/out controls
        myWebView.getSettings().setBuiltInZoomControls(true);

        // Zoom out the best fit your screen
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.loadUrl("https://andela.com/alc/");
    }

}
