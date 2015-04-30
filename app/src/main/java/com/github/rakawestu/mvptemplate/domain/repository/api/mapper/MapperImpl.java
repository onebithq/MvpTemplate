package com.github.rakawestu.mvptemplate.domain.repository.api.mapper;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.api.wrapper.BaseWrapperImpl;

/**
 * Mapper class that implement mapper interface.
 */
public class MapperImpl implements Mapper<BaseWrapperImpl> {

    @Override
    public Model mapResponse(BaseWrapperImpl response) {
        return response.getObject();
    }
}
