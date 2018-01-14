package jtli.com.appforfun;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;

/**
 * Created by Jingtian(Tansent).
 */

public class ProgressBarActivity extends Activity {

//    CountingIdlingResources idlingResources = new CountingIdlingResources("ProgreeBar");

    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

//        pb =  findViewById(R.id.progress);
//        pb.setMax(10);
//        new Thread(){
//            @Override
//            public void run() {
//
//                for (int progress = 0; progress<=10; progress++){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    pb.setProgress(progress);
//                 }
//            }
//        }.start();

        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                pb =  findViewById(R.id.progress);
                pb.setMax(10);
                for (int progress = 0; progress<=10; progress++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pb.setProgress(progress);
                 }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
            }
        }.execute();

    }


}
