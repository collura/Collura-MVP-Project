package example.collura.colluramvp.mvp.mainactivity;


import org.greenrobot.eventbus.EventBus;

import example.collura.colluramvp.mvp.base.BasePresenter;

class AppMainActivityPresenter
        extends BasePresenter<AppMainActivity>
        implements MainActivityPresenter{

    private AppMainActivityModel model;

    public AppMainActivityPresenter (AppMainActivity view) {
        super (view);
        model = new AppMainActivityModel ( this, view );
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
