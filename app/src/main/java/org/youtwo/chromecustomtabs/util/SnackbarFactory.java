package org.youtwo.chromecustomtabs.util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.ViewGroup;
import org.youtwo.chromecustomtabs.R;

/**
 * Created by Bill on 2017/8/27.
 */

public class SnackbarFactory {
  public static Snackbar createSnackbar(Context context, View view, String message) {
    Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
    ViewGroup group = (ViewGroup) snackbar.getView();
    group.setBackgroundColor(context.getResources().getColor(R.color.primary));
    return snackbar;
  }
}
