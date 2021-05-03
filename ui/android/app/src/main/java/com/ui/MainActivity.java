package com.ui;

import android.os.Bundle;
import android.widget.Toast;

import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "ui";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Toast.makeText(this.getApplicationContext(), "Welcome", Toast.LENGTH_SHORT);
    SplashScreen.show(this);
    super.onCreate(savedInstanceState);
  }
}
