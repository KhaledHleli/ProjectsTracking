package sa.tvtc.utilities;


import java.util.Date;

public class ProjectFieldsForExpandableList {

    private String projectNumber, projectStatus, recipientAdministration;
    private Date followUpDate;

    public ProjectFieldsForExpandableList(String projectNumber, String projectStatus, String recipientAdministration, Date followUpDate) {
        this.projectNumber = projectNumber;
        this.projectStatus = projectStatus;
        this.recipientAdministration = recipientAdministration;
        this.followUpDate = followUpDate;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getRecipientAdministration() {
        return recipientAdministration;
    }

    public void setRecipientAdministration(String recipientAdministration) {
        this.recipientAdministration = recipientAdministration;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }
}
