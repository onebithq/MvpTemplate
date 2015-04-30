package com.github.rakawestu.mvptemplate.domain.model;

/**
 * @author rakawm
 */
public abstract class BaseModel {

    public abstract void setId(int id);

    public abstract int getId();

    public abstract void setTitle(String title);

    public abstract String getTitle();

    public abstract void setImage(String image);

    public abstract String getImage();
}
