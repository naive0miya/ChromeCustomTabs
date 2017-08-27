package org.youtwo.chromecustomtabs.injection.component;

import android.app.Application;
import dagger.Component;
import javax.inject.Singleton;
import org.youtwo.chromecustomtabs.injection.module.ApplicationModule;
import org.youtwo.chromecustomtabs.ui.activity.MainActivity;

/**
 * Created by Bill on 2017/8/27.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  void inject(MainActivity mainActivity);

  Application application();
}
