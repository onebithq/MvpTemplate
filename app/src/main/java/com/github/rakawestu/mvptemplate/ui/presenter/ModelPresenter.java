package com.github.rakawestu.mvptemplate.ui.presenter;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.ui.view.View;

/**
 * Sample presenter class.
 *
 * @author rakawm
 */
public interface ModelPresenter extends Presenter<View> {

    void onModel(Model model);

}
