package com.example.giftest;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.io.InputStream;

import com.abhi.gif.lib.AnimatedGifImageView;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {

	WebView webviewActionView;
	private AnimatedGifImageView animatedGifImageView;

	final String baseUrl = "file:///android_asset/";
	final String mimeType = "text/html";
	final String encoding = "utf-8";
	final String failUrl = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		GifWebView view = new GifWebView(this,
				"file:///android_asset/output_9wTcRp.gif");
//		 view.loadDataWithBaseURL("file:///android_asset/",
//		 "<html><center><img src=\"output_9wTcRp.gif\"></html>",
//		 "text/html", "utf-8", "");
		 view.loadDataWithBaseURL(this.baseUrl,
		 "<html><center><img src=\"output_9wTcRp.gif\"></html>",
		 this.mimeType, this.encoding, this.failUrl);
//		view.loadDataWithBaseURL(baseUrl,
//				"<html><center><img src=\"thumbs_computer-100-4.gif\"></html>",
//				mimeType, encoding, failUrl);

		setContentView(view);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}