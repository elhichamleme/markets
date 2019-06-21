package ma.oncf.market.model.repositories;

import ma.oncf.market.model.entities.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
