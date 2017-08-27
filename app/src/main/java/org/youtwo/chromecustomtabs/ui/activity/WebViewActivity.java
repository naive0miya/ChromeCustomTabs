package org.youtwo.chromecustomtabs.ui.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import butterknife.Bind;
import butterknife.ButterKnife;
import org.youtwo.chromecustomtabs.R;

/**
 * Created by Bill on 2017/8/27.
 */

public class WebViewActivity extends BaseActivity {

  @Bind(R.id.web_view)
  WebView mWebView;

  public static final String EXTRA_URL =
      "com.hitherejoe.tabby.ui.activity.WebViewActivity.EXTRA_URL";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_webview);
    ButterKnife.bind(this);
    String url = getIntent().getStringExtra(EXTRA_URL);
    mWebView.setWebViewClient(new WebViewClient());
    WebSettings webSettings = mWebView.getSettings();
    webSettings.setJavaScriptEnabled(true);
    mWebView.loadUrl(url);
    setupActionBar(url);
  }

  private void setupActionBar(String url) {
    setTitle(url);
    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
  }
}
