package com.github.rakawestu.mvptemplate.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.rakawestu.mvptemplate.R;
import com.github.rakawestu.mvptemplate.domain.model.Model;
import com.github.rakawestu.mvptemplate.ui.holder.BaseHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * Sample adapter class.
 *
 * @author rakawm
 */
public class ModelAdapter extends BaseAdapter<Model> {

    private List<Model> models;
    private Context context;

    public ModelAdapter(Context context) {
        models = new ArrayList<>();
        this.context = context;
    }

    @Override
    public void setData(List<Model> models) {
        this.models = models;
    }

    @Override
    public void add(Model object) {
        models.add(object);
    }

    @Override
    public void add(List<Model> objects) {
        models.addAll(objects);
    }

    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.object_details, parent, false);
        return new ObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ObjectHolder objectHolder = (ObjectHolder)holder;
        Model model = models.get(position);
        objectHolder.title.setText(model.getTitle());
        if(model.getImage()!=null && model.getImage().startsWith("http://")){
            Picasso.with(context)
                    .load(model.getImage())
                    .error(R.drawable.no_image)
                    .into(objectHolder.image);
        } else {
            objectHolder.image.setImageResource(R.drawable.no_image);
        }
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    /**
     * Sample holder.
     *
     * @author rakawm
     */
    class ObjectHolder extends BaseHolder{

        @InjectView(R.id.title)
        TextView title;
        @InjectView(R.id.image)
        ImageView image;

        public ObjectHolder(View itemView) {
            super(itemView);
        }
    }
}
