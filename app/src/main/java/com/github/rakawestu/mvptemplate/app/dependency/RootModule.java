package com.github.rakawestu.mvptemplate.app.dependency;

import android.content.Context;
import android.view.LayoutInflater;

import com.github.rakawestu.mvptemplate.app.App;
import com.github.rakawestu.mvptemplate.ui.activity.MainActivity;
import com.github.rakawestu.mvptemplate.ui.fragment.ModelDetailFragment;
import com.github.rakawestu.mvptemplate.ui.presenter.ModelPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Root module class.
 * Used to index all dependency injection that
 * will be used in various class.
 * @author rakawm
 */
@Module(
        includes = {
                ExecutorModule.class,
                InteractorModule.class,
                RepositoryModule.class,
                PresenterModule.class
        },
        injects = {
                App.class,
                ModelPresenterImpl.class,
                MainActivity.class,
                ModelDetailFragment.class
        },
        library = true
)
public class RootModule {

    private final Context context;

    public RootModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return context;
    }

    @Provides
    public LayoutInflater provideLayoutInflater() {
        return LayoutInflater.from(context);
    }
}
