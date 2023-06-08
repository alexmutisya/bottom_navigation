package com.sealteam.bottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class toyota : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_toyota, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val pro: WebView =view.findViewById(R.id.reliable)
        pro.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        pro.loadUrl("https://www.lotamotors.com/TOYOTAS/TOTOTA.html")
        pro.settings.javaScriptEnabled=true
        pro.settings.allowContentAccess=true
        pro.settings.domStorageEnabled=true
        pro.settings.useWideViewPort=true
    }

}