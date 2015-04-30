package com.github.rakawestu.mvptemplate.ui.presenter;

import com.github.rakawestu.mvptemplate.ui.view.View;

/**
 * Presenter with lifecycle
 *
 * @author rakawm
 */
public interface Presenter<T extends View> {

    void initialize();

    void onViewCreate();

    void onViewResume();

    void onViewDestroy();

    void setView(T view);
}
