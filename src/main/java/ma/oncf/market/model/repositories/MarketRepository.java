package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Market;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MarketRepository extends MongoRepository<Market, String> {

    Optional<Market> findByMatricule(String matricule);
}
