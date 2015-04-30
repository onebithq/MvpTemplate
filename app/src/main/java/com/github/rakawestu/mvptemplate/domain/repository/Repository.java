package com.github.rakawestu.mvptemplate.domain.repository;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.exception.BaseException;

/**
 * Repository interfaces.
 *
 * @author rakawm
 */
public interface Repository {
    Model getModel() throws BaseException;
}
