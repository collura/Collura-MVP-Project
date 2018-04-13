package example.collura.mvpstudy.mvp.secondactivity;


/**
 * Created by Betto on 26/03/2018.
 */

public interface SecondActivityModel {
    void onMessageEvent( Object event );
    void getNetworkdata();
    void networkDataCallback( String data );
    void getPreferencesdata();
    void preferencesDataCallback( String data );
}
