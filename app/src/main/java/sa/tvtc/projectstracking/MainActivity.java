package sa.tvtc.projectstracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
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
