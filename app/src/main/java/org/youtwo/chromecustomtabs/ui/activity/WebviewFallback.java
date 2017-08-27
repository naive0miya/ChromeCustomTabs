package org.youtwo.chromecustomtabs.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.youtwo.chromecustomtabs.util.CustomTabActivityHelper;

/**
 * Created by Bill on 2017/8/27.
 */

public class WebviewFallback implements CustomTabActivityHelper.CustomTabFallback  {

  @Override
  public void openUri(Activity activity, Uri uri) {
    Intent intent = new Intent(activity, WebViewActivity.class);
    intent.putExtra(WebViewActivity.EXTRA_URL, uri.toString());
    activity.startActivity(intent);
  }
}
