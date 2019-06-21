package ma.oncf.market.model.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "mission")
public class Mission {
    private String id;
    private Date startDate;
    private Date endDate;
    private String missionIntitle;
    private float dailyCharge;
    private float hourlyCharge;
    @DBRef
    private Project project;
    @DBRef
    private List<Profile> profiles;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMissionIntitle() {
        return missionIntitle;
    }

    public void setMissionIntitle(String missionIntitle) {
        this.missionIntitle = missionIntitle;
    }

    public float getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(float dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public float getHourlyCharge() {
        return hourlyCharge;
    }

    public void setHourlyCharge(float hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}
