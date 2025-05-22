package api.model.workspace; 
import java.util.ArrayList;
import java.util.List;
public class workspaceModel{
    public CostRate costRate;
    public ArrayList<Currency> currencies;
    public String featureSubscriptionType;
    public ArrayList<String> features;
    public HourlyRate hourlyRate;
    public String id;
    public String imageUrl;
    public ArrayList<Membership> memberships;
    public String name;
    public Subdomain subdomain;
    public WorkspaceSettings workspaceSettings;
}
