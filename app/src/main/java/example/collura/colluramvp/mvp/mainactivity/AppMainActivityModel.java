package example.collura.colluramvp.mvp.mainactivity;


import android.app.Activity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import example.collura.colluramvp.mvp.base.BaseModel;
import example.collura.colluramvp.mvp.data.model.eventbus.NetworkResponse;
import example.collura.colluramvp.mvp.data.model.eventbus.PreferencesResponse;

class AppMainActivityModel
        extends BaseModel<AppMainActivityPresenter>
        implements MainActivityModel, MainActivityModel.Db
        , MainActivityModel.Network, MainActivityModel.Preferences{

    AppMainActivityModel (AppMainActivityPresenter presenter, Activity view) {
        super (presenter, view);
        EventBus.getDefault ().register ( this );
    }

    @Override
    public void getNetworkdata () {
        dataManager.getNetworkdata ();
    }

    @Override
    public void getPreferencesdata () {
        dataManager.getPreferencesdata ();
    }

    @Override
    public void networkDataCallback (String data) {
        presenter.networkDataCallback ( data );
    }

    @Override
    public void preferencesDataCallback (String data) {
        presenter.preferencesDataCallback ( data );
    }

    @Subscribe
    public void onMessageEvent(  Object event ){
        if( event.getClass () == NetworkResponse.class ) {
            String response = ( ( NetworkResponse ) event ).getResponse () ;
           networkDataCallback ( response );
        }
        else if(  event.getClass () == PreferencesResponse.class ){
            String response = ( ( PreferencesResponse ) event ).getResponse ();
            preferencesDataCallback ( response );
        }
    }
}
