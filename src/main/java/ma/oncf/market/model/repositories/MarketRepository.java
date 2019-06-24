package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Market;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(collectionResourceRel = "markets", path = "markets")
public interface MarketRepository extends MongoRepository<Market, String> {

    Optional<Market> findByMatricule(String matricule);
}
