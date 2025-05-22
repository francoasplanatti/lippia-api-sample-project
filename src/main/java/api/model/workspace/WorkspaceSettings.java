package api.model.workspace;

import java.util.Date;
import java.util.List;

public class WorkspaceSettings{
    public List<String> adminOnlyPages;
    public AutomaticLock automaticLock;
    public boolean canSeeTimeSheet;
    public boolean canSeeTracker;
    public String currencyFormat;
    public boolean defaultBillableProjects;
    public String durationFormat;
    public boolean forceDescription;
    public boolean forceProjects;
    public boolean forceTags;
    public boolean forceTasks;
    public boolean isProjectPublicByDefault;
    public Date lockTimeEntries;
    public String lockTimeZone;
    public boolean multiFactorEnabled;
    public String numberFormat;
    public boolean onlyAdminsCreateProject;
    public boolean onlyAdminsCreateTag;
    public boolean onlyAdminsCreateTask;
    public boolean onlyAdminsSeeAllTimeEntries;
    public boolean onlyAdminsSeeBillableRates;
    public boolean onlyAdminsSeeDashboard;
    public boolean onlyAdminsSeePublicProjectsEntries;
    public boolean projectFavorites;
    public String projectGroupingLabel;
    public boolean projectPickerSpecialFilter;
    public Round round;
    public boolean timeRoundingInReports;
    public String timeTrackingMode;
    public boolean trackTimeDownToSecond;
}
