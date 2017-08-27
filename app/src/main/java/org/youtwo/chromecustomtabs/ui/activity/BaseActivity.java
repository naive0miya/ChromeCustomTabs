package org.youtwo.chromecustomtabs.ui.activity;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import org.youtwo.chromecustomtabs.ChromeTabApplication;
import org.youtwo.chromecustomtabs.injection.component.ApplicationComponent;

/**
 * Created by Bill on 2017/8/27.
 */

public class BaseActivity extends AppCompatActivity {


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
          fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        } else {
          finish();
        }
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  protected ApplicationComponent applicationComponent() {
    return ChromeTabApplication.get(this).getComponent();
  }
}
