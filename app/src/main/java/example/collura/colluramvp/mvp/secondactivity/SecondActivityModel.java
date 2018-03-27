package example.collura.colluramvp.mvp.secondactivity;


/**
 * Created by Betto on 26/03/2018.
 */

public interface SecondActivityModel {

    void onMessageEvent( Object event );

    interface Network{
        void getNetworkdata();
        void networkDataCallback( String data );
    }

    interface Db{   }

    interface Preferences{
        void getPreferencesdata();
        void preferencesDataCallback( String data );
    }
}
