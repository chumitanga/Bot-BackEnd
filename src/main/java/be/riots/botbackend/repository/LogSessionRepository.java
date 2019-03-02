package be.riots.botbackend.repository;

import be.riots.botbackend.model.LogSession;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogSessionRepository extends MongoRepository<LogSession, String> {
}
