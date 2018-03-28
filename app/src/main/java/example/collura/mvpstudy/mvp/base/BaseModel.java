package example.collura.mvpstudy.mvp.base;


import example.collura.mvpstudy.mvp.data.AppDataManager;

public abstract  class BaseModel  <T>{

    protected T presenter;
    protected final AppDataManager dataManager = AppDataManager.getInstance ();

    public BaseModel (T presenter) {
        this.presenter = presenter;
    }
}
