package sa.tvtc.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import sa.tvtc.projectstracking.R;
import sa.tvtc.utilities.ProjectFieldsForExpandableList;
import sa.tvtc.utilities.ProjectsExpandableListAdapter;

public class HomeActivity extends Activity {

    private ProjectsExpandableListAdapter listAdapter;//test
    private ExpandableListView expListView;
    private List<String> projectsListDataHeader;
    private HashMap<String, ProjectFieldsForExpandableList> projectsListDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        expListView = (ExpandableListView) findViewById(R.id.assignedProjectsExpandableLv);

        prepareListData();

        listAdapter = new ProjectsExpandableListAdapter(this, projectsListDataHeader, projectsListDataChild);

        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        Log.i("HomeActivity", getResources().getConfiguration().locale.getCountry());
        projectsListDataHeader = new ArrayList<String>();
        projectsListDataChild = new HashMap<String, ProjectFieldsForExpandableList>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", new Locale("ar", "SA"));


        projectsListDataHeader.add("مشروع بناء مدرسة بالحي العمراني");
        projectsListDataHeader.add("مشروع انشاء مدرسة للمعوقين");

        ProjectFieldsForExpandableList projectFieldsForExpandableList1 =
                new ProjectFieldsForExpandableList("٨٥٤٤٤٢١", "جاري  العمل", "المدرسة العليا للمهندسين", sdf.format(new Date()));
        projectsListDataChild.put(projectsListDataHeader.get(0), projectFieldsForExpandableList1);
        ProjectFieldsForExpandableList projectFieldsForExpandableList2 =
                new ProjectFieldsForExpandableList("٨٥٤٤٤٢١", "جاري  العمل", "المدرسة العليا للمهندسين", sdf.format(new Date()));
        projectsListDataChild.put(projectsListDataHeader.get(1), projectFieldsForExpandableList2);


    }

}
