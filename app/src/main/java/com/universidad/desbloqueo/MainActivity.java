package com.universidad.desbloqueo;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private PantallaDesbloqueada pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pd= new PantallaDesbloqueada();

    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(pd,new IntentFilter("android.intent.action.USER_PRESENT"));

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(pd);
    }
}