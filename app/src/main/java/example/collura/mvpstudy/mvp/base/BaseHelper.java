package example.collura.mvpstudy.mvp.base;

import example.collura.mvpstudy.mvp.data.AppDataManager;


public abstract class BaseHelper {
    protected  AppDataManager dataManager;

    public BaseHelper ( AppDataManager appDataManager ) {
      if (  dataManager == null  )
            dataManager = appDataManager;
    }
}
