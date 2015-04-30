package com.github.rakawestu.mvptemplate.ui.view;

import java.util.List;

/**
 * Base view interface for
 * list object.
 *
 * @author rakawm
 */
public interface ListView<T> {

    void add(T object);

    void add(List<T> objects);

    void remove(T object);
}
