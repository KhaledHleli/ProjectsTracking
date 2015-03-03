package sa.tvtc.activities;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;

import sa.tvtc.projectstracking.R;

public class AddFollowUpActivity extends FragmentActivity {
    private static int year = 0, month = 0, day = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_follow_up);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getResources().getString(R.string.pick_date_msg));
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new DatePickerDialog(getActivity(), this, AddFollowUpActivity.year,
                    AddFollowUpActivity.month, AddFollowUpActivity.day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            AddFollowUpActivity.year = year;
            AddFollowUpActivity.month = month;
            AddFollowUpActivity.day = day;
        }
    }


}
