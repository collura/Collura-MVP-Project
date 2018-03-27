package example.collura.colluramvp.mvp.mainactivity;



interface MainActivityPresenter {

    void getPreferencesdata();
    void preferencesDataCallback( String  data );
    void getNetworkdata();
    void networkDataCallback(  String data );
    void unregisterModel ();

}
