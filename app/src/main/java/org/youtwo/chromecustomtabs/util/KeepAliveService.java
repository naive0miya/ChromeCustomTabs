package org.youtwo.chromecustomtabs.util;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
/**
 * Created by Bill on 2017/8/27.
 */

public class KeepAliveService extends Service {
  private static final Binder sBinder = new Binder();

  @Override
  public IBinder onBind(Intent intent) {
    return sBinder;
  }
}
