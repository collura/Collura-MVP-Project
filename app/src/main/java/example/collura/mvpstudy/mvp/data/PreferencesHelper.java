package example.collura.mvpstudy.mvp.data;

/**
 * Created by Betto on 26/03/2018.
 */

// METODO DE ACESSO AO SHARED PREFERENCES
interface PreferencesHelper {
    void getPreferencesdata();
    void preferencesDataCallback( String data );
}
