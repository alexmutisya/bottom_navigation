package com.sealteam.bottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class subaru : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subaru, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val charger: WebView =view.findViewById(R.id.fast)
        charger.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        charger.loadUrl("https://www.lotamotors.com/Subarus/subaru.html")
        charger.settings.javaScriptEnabled=true
        charger.settings.allowContentAccess=true
        charger.settings.domStorageEnabled=true
        charger.settings.useWideViewPort=true
    }

}