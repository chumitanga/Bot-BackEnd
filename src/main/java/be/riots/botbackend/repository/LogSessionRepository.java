package be.riots.botbackend.repository;

import be.riots.botbackend.model.LogSession;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository //RestResource(collectionResourceRel = "logSession", path = "logSession")
public interface LogSessionRepository extends MongoRepository<LogSession, String> {
}
