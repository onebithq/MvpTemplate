package com.github.rakawestu.mvptemplate.app;

import android.app.Application;
import android.content.Context;

import com.github.rakawestu.mvptemplate.app.dependency.RootModule;

import dagger.ObjectGraph;

/**
 * Application class for this apps.
 * Used to inject dependency modules to application class.
 *
 * @author rakawm
 */
public class App extends Application{
    private ObjectGraph objectGraph;

    /**
     * Static method for get application context
     *
     * @param context    context.
     * @return application context
     */
    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(new RootModule(this));
        objectGraph.inject(this);
    }

    public void inject(Object object) {
        objectGraph.inject(object);
    }

    /**
     * Add a new module to the dependency graph
     *
     * @param modules
     */
    public void addModules(Object... modules) {
        objectGraph.plus(modules);
    }
}
