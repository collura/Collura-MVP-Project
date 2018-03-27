package example.collura.colluramvp.mvp.base;


import android.app.Activity;

import example.collura.colluramvp.mvp.data.AppDataManager;

public abstract  class BaseModel  <T>{

    protected T presenter;
    protected Activity view;
    protected final AppDataManager dataManager = AppDataManager.getInstance ();

    public BaseModel (T presenter, Activity view) {
        this.presenter = presenter;
        this.view = view;
    }
}
