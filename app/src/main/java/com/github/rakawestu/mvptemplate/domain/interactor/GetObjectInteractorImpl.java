package com.github.rakawestu.mvptemplate.domain.interactor;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.Repository;
import com.github.rakawestu.mvptemplate.domain.repository.exception.BaseException;
import com.github.rakawestu.mvptemplate.executor.InteractorExecutor;
import com.github.rakawestu.mvptemplate.executor.MainThreadExecutor;

import java.util.List;

import timber.log.Timber;

/**
 * @author rakawm
 */
public class GetObjectInteractorImpl extends AbstractInteractor implements GetObjectInteractor {

    private Repository repository;
    private Callback callback;

    public GetObjectInteractorImpl(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, Repository repository) {
        super(interactorExecutor, mainThreadExecutor);
        this.repository = repository;
    }

    @Override
    public void execute(final Callback callback) {
        this.callback = callback;
        getInteractorExecutor().run(this);
    }

    @Override
    public void run() {
        try {
            final List<Model> models = repository.getModel();

            getMainThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    callback.onObject(models);
                }
            });
        } catch (BaseException e){
            Timber.e("Error on GetObjectInteractor interactor.");
            getMainThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    callback.onError();
                }
            });
        }
    }
}
