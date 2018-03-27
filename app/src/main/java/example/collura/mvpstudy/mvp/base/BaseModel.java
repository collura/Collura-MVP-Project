package example.collura.mvpstudy.mvp.base;


import android.app.Activity;

import example.collura.mvpstudy.mvp.data.AppDataManager;

public abstract  class BaseModel  <T>{

    protected T presenter;
    protected Activity view;
    protected final AppDataManager dataManager = AppDataManager.getInstance ();

    public BaseModel (T presenter, Activity view) {
        this.presenter = presenter;
        this.view = view;
    }
}
