#Script de Automatización SerenityBDD E-Commerce Android App

Ejemplo de automatización móvil usando SerenityBDD y Appium aplicando patrón Screenplay.

##Consideraciones
- Tener el celular en modo Debug (Activar Opciones de Desarrollador).
- Obtener la información del dispositivo con el comando en una terminal.

`adb devices`

- Cambiar en el **serenity.properties** los capabilities con la información sobre la cual se desea ejecutar.

`appium.platformVersion =10`
`appium.deviceName = ESU4C18A16000384`

- Tener la App instalada o el Apk en una ruta especifica para indicarla en el **serenity.properties**

- Descargar App de Prueba desde Play Store. [E-Commerce Android App Demo](https://play.google.com/store/apps/details?id=com.solodroid.solomerce&hl=es&gl=US "E-Commerce Android App Demo")

- Aplicación para obtener información de Package y Activity de una App. **APK INFO** [Descargar Apk Info desde Play Store](https://play.google.com/store/apps/details?id=com.wt.apkinfo&hl=es&gl=US "Descargar Apk Info desde Play Store")

- Comando de ejecución del escenario Automatizado.
`gradle clean test aggregate`

- Ruta de Documentación Viva: `C:\Users\xxxxx\serenity_mobile_base_project\target\site\serenity\index.html`

##Links de Interés
- [Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/ "Appium Desired Capabilities")
- [Serenity System Properties and Configuration](https://serenity-bdd.github.io/theserenitybook/latest/serenity-system-properties.html "Serenity System Properties and Configuration")