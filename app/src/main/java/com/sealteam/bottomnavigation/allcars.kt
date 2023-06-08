package com.sealteam.bottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class allcars : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_allcars, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val find: WebView =view.findViewById(R.id.types)
        find.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        find.loadUrl("https://www.lotamotors.com/TOYOTAS/STOCK.html")
        find.settings.javaScriptEnabled=true
        find.settings.allowContentAccess=true
        find.settings.domStorageEnabled=true
        find.settings.useWideViewPort=true
    }

}