package com.trox.launcher;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.widget.Toast;
import android.content.pm.ActivityInfo;

public class MainActivity extends Activity {

    private Button launchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Force Landscape Mode
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        setContentView(R.layout.activity_main);

        launchButton = findViewById(R.id.launch_button);

        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TROX Launcher Started!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
