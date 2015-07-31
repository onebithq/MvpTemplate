package com.github.rakawestu.mvptemplate.domain.repository.mock;

import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.domain.repository.Repository;
import com.github.rakawestu.mvptemplate.domain.repository.exception.BaseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock repository with some dummy data.
 * Used for testing only.
 * @author rakawm
 */
public class MockRepository implements Repository{

    @Override
    public List<Model> getModel() throws BaseException {
        List<Model> models = new ArrayList<>();
        models.add(new Model(1, "Kakashi's true face is revealed.", "http://img.duniaku.net/wp-content/uploads/2015/04/wajah-kakashi.jpg"));
        models.add(new Model(2, "Microsoft Luncurkan Windows 10 di Indonesia! Gratis!", "http://www.jagatreview.com/wp-content/uploads/2015/07/wpid-wp-1438187865680.jpeg"));
        return models;
    }


}
