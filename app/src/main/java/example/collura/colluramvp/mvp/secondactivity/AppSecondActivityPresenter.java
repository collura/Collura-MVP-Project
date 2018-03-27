package example.collura.colluramvp.mvp.secondactivity;

import org.greenrobot.eventbus.EventBus;

import example.collura.colluramvp.mvp.base.BasePresenter;

/**
 * Created by Betto on 26/03/2018.
 */

class AppSecondActivityPresenter extends BasePresenter<AppSecondActivity> implements SecondActivityPresenter {

    private AppSecondActivityModel model;

    public AppSecondActivityPresenter (AppSecondActivity view) {
        super (view);
        model = new AppSecondActivityModel (  this, view );
    }

    @Override
    public void getPreferencesdata () {
        model.getPreferencesdata ();
    }

    @Override
    public void preferencesDataCallback (String data) {
        view.preferencesDatacallback ( data );
    }

    @Override
    public void getNetworkdata () {
        model.getNetworkdata ();
    }

    @Override
    public void networkDataCallback (String data) {
        view.networkDataCallback ( data );
    }

    @Override
    public void unregisterModel () {
        EventBus.getDefault ().unregister ( model );
    }
}
