package ru.dimasokol.dynatrace;

import android.app.Application;

public class DemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Подключение врукопашную, оно не должно требоваться через плагин
        /*Dynatrace.startup(this,
                new DynatraceConfigurationBuilder("(здесь appid)",
                        "здесь beacon").buildConfiguration());*/
    }
}
