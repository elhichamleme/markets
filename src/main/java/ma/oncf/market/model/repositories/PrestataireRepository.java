package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Prestataire;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrestataireRepository extends MongoRepository<Prestataire, String> {
}
