package com.chase.alcandroidchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about.*
import android.net.http.SslError
import android.webkit.SslErrorHandler
import android.webkit.WebView


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        this.title = "About ALC"

        this.actionBar?.setDisplayHomeAsUpEnabled(true)

        webview.loadUrl("https://andela.com/alc/")

        webview.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        }

    }
}
