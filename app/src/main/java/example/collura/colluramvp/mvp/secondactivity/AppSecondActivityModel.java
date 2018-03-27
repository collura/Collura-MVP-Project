package example.collura.colluramvp.mvp.secondactivity;

import android.app.Activity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import example.collura.colluramvp.mvp.base.BaseModel;
import example.collura.colluramvp.mvp.data.model.eventbus.NetworkResponse;
import example.collura.colluramvp.mvp.data.model.eventbus.PreferencesResponse;

/**
 * Created by Betto on 26/03/2018.
 */

class AppSecondActivityModel extends BaseModel<AppSecondActivityPresenter>
implements SecondActivityModel, SecondActivityModel.Db,
SecondActivityModel.Network, SecondActivityModel.Preferences{

    public AppSecondActivityModel (AppSecondActivityPresenter presenter, Activity view) {
        super (presenter, view);
        EventBus.getDefault ().register ( this );
    }

    @Override
    public void getNetworkdata () {
        dataManager.getNetworkdata ();
    }

    @Override
    public void networkDataCallback (String data) {
        presenter.networkDataCallback ( data );
    }

    @Override
    public void getPreferencesdata () {
        dataManager.getPreferencesdata ();
    }

    @Override
    public void preferencesDataCallback (String data) {
        presenter.preferencesDataCallback ( data );
    }

    @Subscribe
    @Override
    public void onMessageEvent (Object event) {
        if( event.getClass () == PreferencesResponse.class ){
            String response = ( ( PreferencesResponse ) event ).getResponse ();
            preferencesDataCallback ( response );
        }
        else if( event.getClass () == NetworkResponse.class ){
            String response = ( ( NetworkResponse ) event ).getResponse ();
            networkDataCallback ( response );
        }

    }
}
