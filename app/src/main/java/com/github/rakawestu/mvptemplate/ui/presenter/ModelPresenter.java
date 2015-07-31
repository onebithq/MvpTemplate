package com.github.rakawestu.mvptemplate.ui.presenter;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.ui.view.ListView;
import com.github.rakawestu.mvptemplate.ui.view.View;

import java.util.List;

/**
 * Sample presenter class.
 *
 * @author rakawm
 */
public interface ModelPresenter extends Presenter<ListView> {

    void onModel(List<Model> models);

}
