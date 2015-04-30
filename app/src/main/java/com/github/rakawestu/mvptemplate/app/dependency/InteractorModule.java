package com.github.rakawestu.mvptemplate.app.dependency;

import com.github.rakawestu.mvptemplate.domain.interactor.GetObjectInteractor;
import com.github.rakawestu.mvptemplate.domain.interactor.GetObjectInteractorImpl;
import com.github.rakawestu.mvptemplate.domain.repository.Repository;
import com.github.rakawestu.mvptemplate.executor.InteractorExecutor;
import com.github.rakawestu.mvptemplate.executor.MainThreadExecutor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module(
        complete = false,
        library = true
)
public class InteractorModule {

    @Provides
    public GetObjectInteractor provideGetObjectInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, @Named("mock_api")Repository repository) {
        return new GetObjectInteractorImpl(interactorExecutor, mainThreadExecutor, repository);
    }
}
