package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.ServiceTrigger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceTriggerRepository extends MongoRepository<ServiceTrigger, String> {
}
