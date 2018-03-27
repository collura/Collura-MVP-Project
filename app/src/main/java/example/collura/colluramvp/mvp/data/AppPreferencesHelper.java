package example.collura.colluramvp.mvp.data;

import example.collura.colluramvp.mvp.base.BaseHelper;

/**
 * Created by Betto on 26/03/2018.
 */

class AppPreferencesHelper extends BaseHelper implements PreferencesHelper {

    private final String TEXTO_ARMAZENADO= "Esse texto foi recuperado do SharedPreferences";


    public AppPreferencesHelper (AppDataManager appDataManager) {
        super (appDataManager);
    }

    @Override
    public void getPreferencesdata () {
        preferencesDataCallback (TEXTO_ARMAZENADO);
    }

    @Override
    public void preferencesDataCallback (String data) {
            dataManager.preferencesDataCallback ( data );
    }
}
