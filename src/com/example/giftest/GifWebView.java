package com.example.giftest;

import android.content.Context;
import android.webkit.WebView;

public class GifWebView extends WebView {

	public GifWebView(Context context, String path) {
		super(context);
		loadUrl(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadDataWithBaseURL(String baseUrl, String data,
			String mimeType, String encoding, String failUrl) {
		// TODO Auto-generated method stub

		super.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, failUrl);
	}

}