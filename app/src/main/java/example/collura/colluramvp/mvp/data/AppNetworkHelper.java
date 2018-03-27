package example.collura.colluramvp.mvp.data;

import example.collura.colluramvp.mvp.base.BaseHelper;

/**
 * Created by Betto on 26/03/2018.
 */

class AppNetworkHelper extends BaseHelper implements NetworkHelper{

    private final String TEXTO_ARMAZENADO= "Esse texto foi recuperado da Rede.";


    public AppNetworkHelper (AppDataManager appDataManager) {
        super (appDataManager);
    }


    @Override
    public void getNetworkdata () {
        networkDataCallback ( TEXTO_ARMAZENADO );
    }

    @Override
    public void networkDataCallback (String data) {
        dataManager.networkDataCallback ( data );
    }
}
