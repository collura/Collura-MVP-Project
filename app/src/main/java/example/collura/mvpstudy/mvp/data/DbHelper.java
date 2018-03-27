package example.collura.mvpstudy.mvp.data;

import example.collura.mvpstudy.mvp.mainactivity.MainActivityModel;
import example.collura.mvpstudy.mvp.secondactivity.SecondActivityModel;

/**
 * Created by Betto on 26/03/2018.
 */


// ESTA CLASSE EXTENDE TODAS AS INTERFACES DE PERSISTENCIA LOCAL
// DAS INTERFACES VIEW MODEL EVITANDO A IMPLEMENTAÇÃO MANUAL.
interface DbHelper extends
        MainActivityModel.Db
        ,SecondActivityModel.Db{

}
