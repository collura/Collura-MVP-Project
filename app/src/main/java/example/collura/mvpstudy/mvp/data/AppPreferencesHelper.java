package example.collura.mvpstudy.mvp.data;

import example.collura.mvpstudy.mvp.base.BaseHelper;
import example.collura.mvpstudy.utils.constants.AppConstants;

/**
 * Created by Betto on 26/03/2018.
 */

class AppPreferencesHelper extends BaseHelper implements PreferencesHelper {


    public AppPreferencesHelper (AppDataManager appDataManager) {
        super (appDataManager);
    }

    @Override
    public void getPreferencesdata () {
        preferencesDataCallback (AppConstants.PREFERENCES_RESPONSE);
    }

    @Override
    public void preferencesDataCallback (String data) {
            dataManager.preferencesDataCallback ( data );
    }
}
