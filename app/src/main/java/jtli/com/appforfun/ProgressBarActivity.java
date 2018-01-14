package jtli.com.appforfun;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

/**
 * Created by Jingtian(Tansent).
 */

public class ProgressBarActivity extends Activity {

    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

        pb =  findViewById(R.id.progress);

        new Thread(){
            @Override
            public void run() {
                pb.setMax(10);
                int progress = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progress++;
                pb.setProgress(progress);
            }
        }.start();

    }


}
