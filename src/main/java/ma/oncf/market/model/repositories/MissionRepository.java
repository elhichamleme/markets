package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Mission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "missions", path = "missions")
public interface MissionRepository extends MongoRepository<Mission, String> {
}
