package jtli.com.appforfun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{
    @BindView(R.id.btn_progressBar)
    Button btnProgressBar;
    @BindView(R.id.btn_database)
    Button btnDatabase;
    @BindView(R.id.btn_recycleView)
    Button btnRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }


    @OnClick({R.id.btn_progressBar, R.id.btn_database, R.id.btn_recycleView})
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_progressBar:
                intent= new Intent(this, ProgressBarActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_database:
                intent = new Intent(this, ProgressBarActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_recycleView:

                break;
        }
    }
}
