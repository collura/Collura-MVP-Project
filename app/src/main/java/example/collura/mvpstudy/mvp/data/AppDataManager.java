package example.collura.mvpstudy.mvp.data;


import org.greenrobot.eventbus.EventBus;

import example.collura.mvpstudy.mvp.data.model.eventbus.NetworkResponse;
import example.collura.mvpstudy.mvp.data.model.eventbus.PreferencesResponse;

public class AppDataManager implements DataManager {

    private final static AppDataManager instance = new AppDataManager();
    private static AppNetworkHelper appNetworkHelper;
    private static AppDbHelper appDbHelper;
    private static AppPreferencesHelper preferencesHelper;

    // SINGLETON CLASS
    public static AppDataManager getInstance(){
       if ( appNetworkHelper == null )
            appNetworkHelper = new AppNetworkHelper (instance);

        if ( appDbHelper == null )
            appDbHelper = new AppDbHelper (instance);

       if ( preferencesHelper == null )
            preferencesHelper = new AppPreferencesHelper (instance);
        return instance;
    }

    @Override
    public void getNetworkdata () {
            appNetworkHelper.getNetworkdata ();
    }

    @Override
    public void networkDataCallback (String data) {
        EventBus.getDefault ().post (  new NetworkResponse ( data ));
    }

    @Override
    public void getPreferencesdata () {
        preferencesHelper.getPreferencesdata ();
    }

    @Override
    public void preferencesDataCallback (String data) {
            EventBus.getDefault ().post ( new PreferencesResponse ( data ));
    }
}
