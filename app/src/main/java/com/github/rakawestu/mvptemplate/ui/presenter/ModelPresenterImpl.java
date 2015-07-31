package com.github.rakawestu.mvptemplate.ui.presenter;

import android.content.Context;
import android.widget.Toast;

import com.github.rakawestu.mvptemplate.domain.interactor.GetObjectInteractor;
import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.ui.view.ListView;
import com.github.rakawestu.mvptemplate.ui.view.View;

import java.util.List;

/**
 * @author rakawm
 */
public class ModelPresenterImpl implements ModelPresenter {
    private ListView view;
    private Context context;
    private GetObjectInteractor getObjectInteractor;

    public ModelPresenterImpl(Context context, GetObjectInteractor getObjectInteractor){
        this.context = context;
        this.getObjectInteractor = getObjectInteractor;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onModel(List<Model> models) {

    }

    @Override
    public void initialize() {
        getModel();
    }

    @Override
    public void onViewCreate() {
        //Do nothing
    }

    @Override
    public void onViewResume() {
        //Do nothing
    }

    @Override
    public void onViewDestroy() {
        //Do nothing
    }

    @Override
    public void setView(ListView view) {
        this.view = view;
    }

    public void getModel() {
        getObjectInteractor.execute(new GetObjectInteractor.Callback() {
            @Override
            public void onObject(List<Model> model) {
                view.add(model);
            }

            @Override
            public void onError() {
                Toast.makeText(context, "Error in interactor", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
