package com.jiayil.testwebview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var browser: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        browser = findViewById<WebView>(R.id.web_view_main)
        browser?.webViewClient = MyBrowser()


        browser?.loadUrl("http://www.google.com")
    }

    private class MyBrowser : WebViewClient() {
    }
}