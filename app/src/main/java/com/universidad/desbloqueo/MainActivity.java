package com.universidad.desbloqueo;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

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
        //pedirPermiso();
        requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
        pd= new PantallaDesbloqueada();

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        Log.d("PERMISO", "Callback ejecutado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(pd,new IntentFilter(Intent.ACTION_USER_PRESENT));


    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(pd);
    }

    public void pedirPermiso() {
        if (checkSelfPermission(Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);

        }
    }
}