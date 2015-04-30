package com.github.rakawestu.mvptemplate.domain.repository.mock;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.Repository;
import com.github.rakawestu.mvptemplate.domain.repository.exception.BaseException;

/**
 * Mock repository with some dummy data.
 * Used for testing only.
 * @author rakawm
 */
public class MockRepository implements Repository{

    @Override
    public Model getModel() throws BaseException {
        Model model = new Model();
        model.setId(1);
        model.setTitle("Kakashi's true face is revealed.");
        model.setImage("http://img.duniaku.net/wp-content/uploads/2015/04/wajah-kakashi.jpg");
        return model;
    }


}
