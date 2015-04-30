package com.github.rakawestu.mvptemplate.domain.repository.api.mapper;

import com.github.rakawestu.mvptemplate.domain.model.Model;

/**
 * Response mapper interfaces.
 *
 * @author rakawm
 */
public interface Mapper<T> {

    Model mapResponse(T response);
}
