package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
