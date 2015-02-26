package sa.tvtc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import sa.tvtc.projectstracking.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i < 2; i++) {
                        sleep(1000);
                        Log.i("MainActivity","--------->SLEEPING RIGHT NOW");
                    }
                } catch (Exception e) {
                } finally {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
            }
        };
        thread.start();
    }

}
