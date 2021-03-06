package com.panmin.lockscreendemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class LockScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.colorPrimary);
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        setContentView(R.layout.activity_lock_screen);
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
