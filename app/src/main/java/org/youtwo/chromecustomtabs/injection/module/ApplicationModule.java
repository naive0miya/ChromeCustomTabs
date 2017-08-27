package org.youtwo.chromecustomtabs.injection.module;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Bill on 2017/8/27.
 */

@Module
public class ApplicationModule {
  protected final Application mApplication;

  public ApplicationModule(Application application) {
    mApplication = application;
  }

  @Provides
  @Singleton
  Application provideApplication() {
    return mApplication;
  }
}
