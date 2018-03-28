package example.collura.mvpstudy.mvp.base;

import android.support.v7.app.AppCompatActivity;


public abstract  class BaseActivity extends AppCompatActivity{

    protected abstract void showToast( String msg );
    protected abstract void showSnackBar( String msg );
    protected abstract void showProgressBar( String msg );
    protected abstract void dismissProgressBar();
    protected  abstract void dismissSnackBar();
}
