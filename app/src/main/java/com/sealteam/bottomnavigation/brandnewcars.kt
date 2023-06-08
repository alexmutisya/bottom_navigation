package com.sealteam.bottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class brandnewcars : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
//indicates that Lint should ignore the specified warnings for elements

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brandnewcars, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val brand: WebView =view.findViewById(R.id.clean)
        brand.webViewClient=object: WebViewClient(){


            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true

            }

        }
        brand.loadUrl("https://www.lotamotors.com/Mercedes/merc.htm")
        brand.settings.javaScriptEnabled=true
        brand.settings.allowContentAccess=true
        brand.settings.domStorageEnabled=true
        brand.settings.useWideViewPort=true
    }

}