package org.youtwo.chromecustomtabs;

import android.app.Application;
import android.content.Context;
import org.youtwo.chromecustomtabs.injection.component.ApplicationComponent;
import org.youtwo.chromecustomtabs.injection.component.DaggerApplicationComponent;
import org.youtwo.chromecustomtabs.injection.module.ApplicationModule;
import timber.log.Timber;

/**
 * Created by Bill on 2017/8/27.
 */

public class ChromeTabApplication extends Application {

  ApplicationComponent mApplicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());

    mApplicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build();
  }

  public static ChromeTabApplication get(Context context) {
    return (ChromeTabApplication) context.getApplicationContext();
  }

  public ApplicationComponent getComponent() {
    return mApplicationComponent;
  }

  // Needed to replace the component with a test specific one
  public void setComponent(ApplicationComponent applicationComponent) {
    mApplicationComponent = applicationComponent;
  }
}
