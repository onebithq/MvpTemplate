package com.github.rakawestu.mvptemplate.app.dependency;

import com.github.rakawestu.mvptemplate.executor.InteractorExecutor;
import com.github.rakawestu.mvptemplate.executor.MainThreadExecutor;
import com.github.rakawestu.mvptemplate.executor.MainThreadExecutorImp;
import com.github.rakawestu.mvptemplate.executor.ThreadExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module(
        complete = false,
        library = true
)
public class ExecutorModule {


    @Provides
    @Singleton
    public InteractorExecutor provideExecutor() {
        return new ThreadExecutor();
    }

    @Provides
    @Singleton
    public MainThreadExecutor provideMainThreadExecutor() {
        return new MainThreadExecutorImp();
    }
}
