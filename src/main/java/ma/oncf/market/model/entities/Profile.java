package ma.oncf.market.model.entities;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "profile")
public class Profile {
    private String id;
    private String intitle;
    @DBRef
    private List<Mission> missions;
}
