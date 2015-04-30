package com.github.rakawestu.mvptemplate.domain.repository.api.wrapper;

import com.github.rakawestu.mvptemplate.domain.model.Model;

/**
 * Sample wrapper that extends from BaseWrapper class.
 *
 * @author rakawm
 */
public class BaseWrapperImpl extends BaseWrapper<Model> {
    private boolean error;
    private Model model;

    @Override
    public boolean isError() {
        return error;
    }

    @Override
    public Model getObject() {
        return model;
    }
}
