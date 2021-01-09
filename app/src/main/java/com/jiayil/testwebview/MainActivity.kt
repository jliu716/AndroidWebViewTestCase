package com.jiayil.testwebview

import android.app.Activity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    private var browser: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        browser = findViewById<WebView>(R.id.web_view_main)
        browser?.webViewClient = MyBrowser()


        browser?.loadUrl("http://www.google.com")
    }

    private class MyBrowser : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            print(request?.url)
            return super.shouldOverrideUrlLoading(view, request)
        }

//        override fun shouldOverrideUrlLoading(
//            view: WebView,
//            url: String
//        ): Boolean {
//            view.loadUrl(url)
//            return true
//        }
    }
}