package sa.tvtc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import sa.tvtc.projectstracking.R;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void authenticationButtonListener(View v) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        Log.v("LoginActivity","authenticationButtonListener");
    }
}
