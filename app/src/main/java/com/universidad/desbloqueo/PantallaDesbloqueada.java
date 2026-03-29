package com.universidad.desbloqueo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class PantallaDesbloqueada extends BroadcastReceiver {
    private static final String telefono = "2664553747";

    public void onReceive(Context context, Intent intent){

        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
            Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_SHORT).show();
            Log.d("UnlockReceiver", "Se detectó el evento ACTION_USER_PRESENT");

            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:" + telefono));
            dialIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(dialIntent);
        }
    }

}
