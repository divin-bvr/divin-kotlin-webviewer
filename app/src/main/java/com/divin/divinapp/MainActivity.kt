package com.divin.divinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val url ="https://bugemauniv.ac.ug"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web.webViewClient = WebViewClient()
        web.loadUrl(url)

    }

    override fun onBackPressed() {
        if(web!!.canGoBack()){
            web.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}