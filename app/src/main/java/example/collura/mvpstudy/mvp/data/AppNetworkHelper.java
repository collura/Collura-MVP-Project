package example.collura.mvpstudy.mvp.data;

import example.collura.mvpstudy.mvp.base.BaseHelper;
import example.collura.mvpstudy.utils.constants.AppConstants;

/**
 * Created by Betto on 26/03/2018.
 */

class AppNetworkHelper extends BaseHelper implements NetworkHelper{


    public AppNetworkHelper (AppDataManager appDataManager) {
        super (appDataManager);
    }


    @Override
    public void getNetworkdata () {
        networkDataCallback ( AppConstants.NETWORK_RESPONSE );
    }

    @Override
    public void networkDataCallback (String data) {
        dataManager.networkDataCallback ( data );
    }
}
