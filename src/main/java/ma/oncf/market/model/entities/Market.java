package ma.oncf.market.model.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "markets")
public class Market {

    @Id
    private String id;
    private String matricule;
    private Date startDate;
    private Date endDate;
    private long budgetPlanned;
    private MarketAdministrator marketAdministrator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public long getBudgetPlanned() {
        return budgetPlanned;
    }

    public void setBudgetPlanned(long budgetPlanned) {
        this.budgetPlanned = budgetPlanned;
    }

    public MarketAdministrator getMarketAdministrator() {
        return marketAdministrator;
    }

    public void setMarketAdministrator(MarketAdministrator marketAdministrator) {
        this.marketAdministrator = marketAdministrator;
    }
}
