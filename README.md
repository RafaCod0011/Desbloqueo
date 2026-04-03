# 📱 Trabajo Práctico 2 – BroadcastReceiver

Este proyecto corresponde al Trabajo Práctico Nº2 de Programación Móvil, cuyo objetivo es implementar un BroadcastReceiver capaz de detectar eventos del sistema y responder mediante Intents implícitos.

La aplicación fue desarrollada en Android Studio con Java, poniendo en práctica el uso de componentes de Android, ciclo de vida del sistema, eventos globales y manejo de acciones automáticas dentro del dispositivo.

---

## 🎯 Objetivo del trabajo

Aplicar el uso de BroadcastReceiver para capturar eventos del sistema y comprender cómo responder a ellos mediante Intents implícitos.

---

## 📌 Descripción del proyecto

La aplicación implementa un BroadcastReceiver que escucha el evento del sistema: Intent.ACTION_USER_PRESENT

Este evento se activa cuando el usuario desbloquea la pantalla del dispositivo.

Cada vez que se detecta este evento, la aplicación realiza automáticamente las siguientes acciones:
- 🔔 Muestra un Toast con el mensaje: "Pantalla desbloqueada detectada"
- 📝 Registra un mensaje en Logcat indicando que el dispositivo fue desbloqueado.
- 📞 Genera un Intent implícito para abrir la app de teléfono con el número: 2664553747

---

## 🚀 Funcionalidades implementadas

- ✅ Detección automática del evento de desbloqueo del dispositivo
- ✅ Implementación de un BroadcastReceiver registrado en el Manifest
- ✅ Mostrar un Toast informativo
- ✅ Registro del evento en Logcat
- ✅ Intent implícito para abrir la aplicación de llamadas
- ✅ Interfaz simple con pantalla inicial del TP
- ✅ Código organizado y comentado

---

## 📂 Estructura del proyecto

```bash
conversorAndroid-main/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/desarrolloar/conversor/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── MainActivityViewModel.java
│   │   │   │   └── modelo/
│   │   │   │       └── Conversor.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values/
│   │   │   │   ├── drawable/
│   │   │   │   ├── mipmap-*/
│   │   │   │   └── xml/
│   │   │   └── AndroidManifest.xml
│   │
│   ├── build.gradle.kts
│   └── proguard-rules.pro
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
└── img/captura-app.jpg
```

---

## ⚙️ Cómo ejecutar el proyecto

- Clonar el repositorio: git clone https://github.com/RafaCod0011/Desbloqueo.git
- Abrir el proyecto en Android Studio
- Esperar que Gradle sincronice
- Ejecutar la app en un emulador o dispositivo físico
- Bloquear y desbloquear la pantalla para activar el BroadcastReceiver

---

## 👨‍💻 Integrantes del grupo

- Facundo Martín García – DNI:
- Victor Angel Aguilera – DNI: 36220045
- Rafael Nicolas Cuello – DNI:
- Martin Nahuel Becerra – DNI: 47266622

---

## ✅ Conclusión

Este trabajo nos permitió comprender el funcionamiento de los BroadcastReceivers, su interacción con los eventos del sistema y el uso de Intents implícitos para invocar aplicaciones externas.

