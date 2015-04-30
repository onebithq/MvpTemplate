package com.github.rakawestu.mvptemplate.app;

import android.content.Context;

/**
 * @author rakawm
 */
public abstract class BasePresenter {

    public BasePresenter(Context context) {
        ((App) context.getApplicationContext()).inject(this);

    }
}
