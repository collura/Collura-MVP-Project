package example.collura.colluramvp.mvp.base;

import example.collura.colluramvp.mvp.data.AppDataManager;


public abstract class BaseHelper {
    protected  static AppDataManager dataManager;

    public BaseHelper ( AppDataManager appDataManager ) {
      if (  dataManager == null )
            dataManager =appDataManager;
    }
}
