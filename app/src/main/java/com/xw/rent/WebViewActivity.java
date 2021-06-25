package com.xw.rent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.xw.baselib.utils.StatusBarHelper;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private String loadUrl = "https://adultfrinendfinder-nsa.web.app/api/uber/in.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        StatusBarHelper.translucent(this);
        webView = findViewById(R.id.webView);

        webView.loadUrl(loadUrl);

        boolean loadInProject = getIntent().getBooleanExtra("load_in_project",false);

        if (loadInProject) {
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });

            webView.setOnKeyListener((view, code, keyEvent) -> {
                if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                    if (code == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
                        webView.goBack();
                        return true;
                    }
                }
                return false;
            });
        }
    }
}