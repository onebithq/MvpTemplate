package com.github.rakawestu.mvptemplate.domain.repository;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.exception.BaseException;

import java.util.List;

/**
 * Repository interfaces.
 *
 * @author rakawm
 */
public interface Repository {
    List<Model> getModel() throws BaseException;
}
