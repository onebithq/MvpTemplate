package com.github.rakawestu.mvptemplate.domain.repository.api.wrapper;

/**
 * Base data wrapper for well-formatted JSON.
 * <code>Sample format:
 * {
 *     "error":false,
 *     "object": {
 *         "id":0,
 *         "name":"string",
 *         "image":"http://server/image.jpg"
 *     }
 * }</code>
 *
 * @author rakawm
 */
public abstract class BaseWrapper<T> {

    /**
     * Return boolean value that indicating
     * if the return value is wrong or not.
     * @return error boolean.
     */
    public abstract boolean isError();

    /**
     * Return the object inside this wrapper.
     * @return object.
     */
    public abstract T getObject();
}
