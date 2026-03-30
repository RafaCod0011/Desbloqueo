package com.universidad.desbloqueo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class PantallaDesbloqueada extends BroadcastReceiver {

    //Este código crea un “escuchador” del sistema (un BroadcastReceiver)
    //que está atento a cuando el usuario desbloquea el celular.
    //Cuando pasa eso:
    //Detecta el evento (ACTION_USER_PRESENT, o sea, cuando aparece la pantalla después de desbloquear).
    //Muestra un mensajito en pantalla (un Toast) diciendo que se detectó el desbloqueo.
    //Muestra un mensaje en el log.
    //automáticamente hace una llamada telefónica al número  de telefono definido.
    private static final String telefono = "2664553747";

    public void onReceive(Context context, Intent intent){


        if (Intent.ACTION_USER_PRESENT.equals(intent.getAction())) {
            Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_SHORT).show();
            Log.d("UnlockReceiver", "Se detectó el evento ACTION_USER_PRESENT");

            // Para requerir la accion del usuario, descomentar
            // Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            // y comentar:
            Intent dialIntent = new Intent(Intent.ACTION_CALL);

            dialIntent.setData(Uri.parse("tel:" + telefono));
            dialIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(dialIntent);
        }
    }

}
