package example.collura.mvpstudy.mvp.mainactivity;



public interface MainActivityModel {
    void onMessageEvent(  Object event );

    interface Network{
        void getNetworkdata();
        void networkDataCallback( String data );
    }

    interface Db{

    }

    interface Preferences{
        void getPreferencesdata();
        void preferencesDataCallback( String data );
    }

}
