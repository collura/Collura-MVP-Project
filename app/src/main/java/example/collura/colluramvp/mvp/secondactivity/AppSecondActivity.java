package example.collura.colluramvp.mvp.secondactivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.collura.colluramvp.R;
import example.collura.colluramvp.mvp.base.BaseActivity;

public class AppSecondActivity extends BaseActivity implements SecondActivity {

    private AppSecondActivityPresenter presenter;
    @BindView ( R.id.tv_network_data )
    TextView  tvNetworkdata;

    @BindView (R.id.tv_preferences_data)
    TextView tvPreferencesData;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
        ButterKnife.bind ( this );

        presenter = new AppSecondActivityPresenter ( this );
    }


    @Override @OnClick(  R.id.bt_getdata )
    public void getData () {
        presenter.getNetworkdata ();
        presenter.getPreferencesdata ();
    }

    @Override
    public void preferencesDatacallback (String data) {
        tvPreferencesData.setText ( data );
    }

    @Override
    public void networkDataCallback (String data) {
        tvNetworkdata.setText ( data );
    }

    @Override
    protected void onDestroy () {
        super.onDestroy ();
        presenter.unregisterModel ();
    }
}
