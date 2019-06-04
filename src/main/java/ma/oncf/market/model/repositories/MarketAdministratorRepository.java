package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.MarketAdministrator;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MarketAdministratorRepository extends MongoRepository<MarketAdministrator, String> {

    Optional<MarketAdministrator>  findByUsername(String username);
}
