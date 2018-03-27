package example.collura.colluramvp.mvp.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.collura.colluramvp.R;
import example.collura.colluramvp.mvp.base.BaseActivity;
import example.collura.colluramvp.mvp.secondactivity.AppSecondActivity;

public class AppMainActivity
        extends BaseActivity
        implements MainActivity{

    private AppMainActivityPresenter presenter;

    @BindView (R.id.tv_preferences_data)
    TextView tvPreferencesData;

    @BindView ( R.id.tv_network_data )
    TextView tvNetworkData;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ButterKnife.bind ( this );
        presenter = new AppMainActivityPresenter ( this );
    }

    @Override
    protected void onResume () {
        super.onResume ();
        tvNetworkData.setText ("Aguardando dados da Rede...");
        tvPreferencesData.setText ("Aguardando dados de preferências ...");
    }

    @OnClick(R.id.call_second_activity)
    @Override
    public void callSecondActivity () {
        startActivity ( new Intent ( this, AppSecondActivity.class));
    }

    @OnClick( R.id.get_preferences_data )
    @Override
    public void getPreferencesData () {
        presenter.getPreferencesdata ();
    }

    @OnClick( R.id.get_network_data )
    @Override
    public void getNetworkData () {
        presenter.getNetworkdata ();
    }

    @Override
    public void preferencesDatacallback (String data) {
        tvPreferencesData.setText ( data );
    }

    @Override
    public void networkDataCallback (String data) {
        tvNetworkData.setText ( data );
    }

    @Override
    protected void onDestroy () {
        super.onDestroy ();
       presenter.unregisterModel ();
    }
}
