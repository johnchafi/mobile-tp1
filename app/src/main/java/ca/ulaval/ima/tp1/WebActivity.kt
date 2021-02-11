package ca.ulaval.ima.tp1

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class WebActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        val int = getIntent()
        val value = int.getStringExtra("url")
        val webView = findViewById<WebView>(R.id.webView)
        //webView.settings.javaScriptEnabled
        //webView.webViewClient;
        webView.loadUrl(value.toString())
    }

    fun close (view: View){
        finish()
    }


}