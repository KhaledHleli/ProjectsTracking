package sa.tvtc.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
        projectsListDataHeader = new ArrayList<String>();
        projectsListDataChild = new HashMap<String, ProjectFieldsForExpandableList>();

        // Adding child data
        projectsListDataHeader.add("Building of swimming pool0");
        projectsListDataHeader.add("Building of swimming pool1");
        projectsListDataHeader.add("Building of swimming pool2");

        ProjectFieldsForExpandableList projectFieldsForExpandableList1 =
                new ProjectFieldsForExpandableList("P122033", "In progress", "Ministry MLV LJFJ Of Service", new Date());
        projectsListDataChild.put(projectsListDataHeader.get(0), projectFieldsForExpandableList1);

        ProjectFieldsForExpandableList projectFieldsForExpandableList2 =
                new ProjectFieldsForExpandableList("P122033", "In progress", "Ministry MLV", new Date());
        projectsListDataChild.put(projectsListDataHeader.get(1), projectFieldsForExpandableList1);
        ProjectFieldsForExpandableList projectFieldsForExpandableList3 =
                new ProjectFieldsForExpandableList("P122033", "In progress", "Ministry MLV", new Date());
        projectsListDataChild.put(projectsListDataHeader.get(2), projectFieldsForExpandableList1);

    }

}
