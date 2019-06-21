package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.MarketAdministrator;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarketAdministratorRepository extends MongoRepository<MarketAdministrator, String> {

}
