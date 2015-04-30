package com.github.rakawestu.mvptemplate.domain.model;

/**
 * Sample model that mostly used in
 * some application
 *
 * @author rakawm
 *
 */
public class Model extends BaseModel{
    int id;
    String title;
    String image;

    public Model(){

    }

    public Model(int id, String title, String image){
        this.id = id;
        this.title = title;
        this.image = image;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String getImage() {
        return image;
    }
}
