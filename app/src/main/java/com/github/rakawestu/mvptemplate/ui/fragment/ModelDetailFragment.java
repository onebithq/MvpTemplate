package com.github.rakawestu.mvptemplate.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.rakawestu.mvptemplate.R;
import com.github.rakawestu.mvptemplate.app.BaseFragment;
import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.ui.adapter.ModelAdapter;
import com.github.rakawestu.mvptemplate.ui.presenter.ModelPresenter;
import com.github.rakawestu.mvptemplate.ui.view.ListView;

import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import timber.log.Timber;

/**
 * @author rakawm
 */
public class ModelDetailFragment extends BaseFragment implements ListView<Model> {

    @Inject
    ModelPresenter presenter;

    @InjectView(R.id.recycler_view)
    RecyclerView recyclerView;

    private ModelAdapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                          @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.inject(this, rootView);
        adapter = new ModelAdapter(getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        initializeRecyclerView();
        presenter.setView(this);
        presenter.onViewCreate();

        if (savedInstanceState == null) {
            Timber.i("First time running");
            presenter.initialize();
        }
    }

    @Override
    public void showDetails(Object object) {

    }

    private void initializeRecyclerView(){
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void add(Model object) {

    }

    @Override
    public void add(List<Model> objects) {
        adapter.add(objects);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void remove(Model object) {

    }
}
