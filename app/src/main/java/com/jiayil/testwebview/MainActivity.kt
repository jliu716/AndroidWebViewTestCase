package com.jiayil.testwebview

import android.app.Activity
import android.os.Bundle
import android.webkit.*

class MainActivity : Activity() {

    private var browser: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        browser = findViewById<WebView>(R.id.web_view_main)
        browser?.webViewClient = MyBrowser()

        var headers = mutableMapOf<String, String>()
        headers["token"] = "123"
        browser?.loadUrl("http://www.google.com", headers)

        // Potential cookie handling
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(browser, true);
    }

    private class MyBrowser : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun shouldInterceptRequest(
            view: WebView?,
            request: WebResourceRequest?
        ): WebResourceResponse? {
            return super.shouldInterceptRequest(view, request)
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