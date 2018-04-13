package example.collura.mvpstudy.mvp.data;

/**
 * Created by Betto on 26/03/2018.
 */

// METODOS DE ACESSO A DATABASE EXTERNA
interface NetworkHelper  {
    void getNetworkdata();
    void networkDataCallback( String data );
}
