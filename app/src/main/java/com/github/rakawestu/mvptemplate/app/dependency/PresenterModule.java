package com.github.rakawestu.mvptemplate.app.dependency;

import android.content.Context;
import com.github.rakawestu.mvptemplate.domain.interactor.GetObjectInteractor;
import com.github.rakawestu.mvptemplate.ui.presenter.ModelPresenter;
import com.github.rakawestu.mvptemplate.ui.presenter.ModelPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module(
        complete = false,
        library = true
)
public class PresenterModule {

    @Provides
    public ModelPresenter provideModelPresenter(Context context, GetObjectInteractor getObjectInteractor) {
        return new ModelPresenterImpl(context, getObjectInteractor);
    }

}
