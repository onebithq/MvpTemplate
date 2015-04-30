package com.github.rakawestu.mvptemplate.domain.interactor;

import com.github.rakawestu.mvptemplate.domain.model.Model;

/**
 * Interactor interface for getting object.
 * @author rakawm
 */
public interface GetObjectInteractor {
    void execute(final Callback callback);

    interface Callback {

        void onObject(Model model);

        void onError();
    }
}
