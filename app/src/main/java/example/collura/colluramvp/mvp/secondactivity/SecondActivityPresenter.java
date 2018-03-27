package example.collura.colluramvp.mvp.secondactivity;

/**
 * Created by Betto on 26/03/2018.
 */

interface SecondActivityPresenter {
    void getPreferencesdata();
    void preferencesDataCallback( String  data );
    void getNetworkdata();
    void networkDataCallback(  String data );
    void unregisterModel ();
}
