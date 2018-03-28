package example.collura.mvpstudy.mvp.secondactivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import example.collura.mvpstudy.mvp.base.BaseModel;
import example.collura.mvpstudy.mvp.data.model.eventbus.NetworkResponse;
import example.collura.mvpstudy.mvp.data.model.eventbus.PreferencesResponse;

/**
 * Created by Betto on 26/03/2018.
 */

class AppSecondActivityModel extends BaseModel<AppSecondActivityPresenter>
implements SecondActivityModel, SecondActivityModel.Db,
SecondActivityModel.Network, SecondActivityModel.Preferences{

    public AppSecondActivityModel (AppSecondActivityPresenter presenter) {
        super (presenter);

        if ( !EventBus.getDefault ().isRegistered ( this ) )
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


    // CATCH EVENTS SEND BY  DATAMANAGER
    @Override @Subscribe
    public void onMessageEvent (Object event) {
        // CATCH NETWORK RESPONSE
        if( event.getClass () == PreferencesResponse.class ){
            String response = ( ( PreferencesResponse ) event ).getString ();
            preferencesDataCallback ( response );
        }
        // CATCH PREFERENCES RESPONSE
        else if( event.getClass () == NetworkResponse.class ){
            String response = ( ( NetworkResponse ) event ).getString ();
            networkDataCallback ( response );
        }

    }
}
