package api.model.project; 
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
public class projectModel{
    public String color;
    public String duration;
    public String id;
    public ArrayList<Membership> memberships;
    public String name;
    public String note;
    @JsonProperty("public") 
    public boolean mypublic;
    public String workspaceId;
}
