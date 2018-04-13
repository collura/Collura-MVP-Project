package example.collura.mvpstudy.mvp.mainactivity;


/* Esta interface é dividida por camada de persistência
// as quais serão herdadas pelas classes Helper específicas
// para cada camada. Esta Interface e a activity deste pacote
// necessitam ter o acesso público, as demais classes serão package private.
 */

public interface MainActivityModel {
    void onMessageEvent(  Object event );
    void getNetworkdata();
    void networkDataCallback( String data );
    void getPreferencesdata();
    void preferencesDataCallback( String data );
}
