package example.collura.mvpstudy.mvp.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public abstract  class BaseActivity extends AppCompatActivity{

    void showToast( String text ){
        Toast.makeText (this, text, Toast.LENGTH_SHORT).show ();
    }
}
