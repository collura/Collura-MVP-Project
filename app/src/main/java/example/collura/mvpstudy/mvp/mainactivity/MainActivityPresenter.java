package example.collura.mvpstudy.mvp.mainactivity;



interface MainActivityPresenter {

    void getPreferencesdata();
    void preferencesDataCallback( String  data );
    void getNetworkdata();
    void networkDataCallback(  String data );
    void unregisterModel ();

}
