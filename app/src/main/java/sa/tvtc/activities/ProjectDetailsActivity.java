package sa.tvtc.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import sa.tvtc.projectstracking.R;

public class ProjectDetailsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_details);
    }

    public void goToAddFollowUpPage(View v) {
        Intent intent = new Intent(ProjectDetailsActivity.this, AddFollowUpActivity.class);
        startActivity(intent);
    }
}
