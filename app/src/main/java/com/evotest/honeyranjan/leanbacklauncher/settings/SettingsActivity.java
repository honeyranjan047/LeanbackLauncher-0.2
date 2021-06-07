package com.evotest.honeyranjan.leanbacklauncher.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.evotest.honeyranjan.leanbacklauncher.MainActivity;
import com.evotest.honeyranjan.leanbacklauncher.R;

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.bg_default));

        setContentView(R.layout.settings_fragment);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }
}


