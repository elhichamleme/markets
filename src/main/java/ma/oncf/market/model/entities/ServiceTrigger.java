package ma.oncf.market.model.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "serviceTrigger")
public class ServiceTrigger {
    private String id;
    private Date startDate;
    private Date endDate;
    private Boolean receptionStatus;
    private Date expectedDate;
    private Boolean billingStatus;
    @DBRef
    private Project project;

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

    public Boolean getReceptionStatus() {
        return receptionStatus;
    }

    public void setReceptionStatus(Boolean receptionStatus) {
        this.receptionStatus = receptionStatus;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Boolean getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(Boolean billingStatus) {
        this.billingStatus = billingStatus;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
