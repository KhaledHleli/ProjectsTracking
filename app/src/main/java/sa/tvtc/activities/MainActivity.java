package sa.tvtc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Calendar;
import java.util.Locale;

import sa.tvtc.projectstracking.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.i("MainActivity:Year in arabic:", String.valueOf(Calendar.getInstance(new Locale("ar")).get(Calendar.YEAR)));
        Log.i("MainActivity:Day in arabic:", String.valueOf(Calendar.getInstance(new Locale("ar")).get(Calendar.DAY_OF_MONTH)));
        Log.i("MainActivity:Month in arabic:", String.valueOf(Calendar.getInstance(new Locale("ar")).get(Calendar.MONTH)));

        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i < 2; i++) {
                        sleep(1000);
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
