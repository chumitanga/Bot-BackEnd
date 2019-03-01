package be.riots.botbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BOTDevice extends MongoRepository<BOTDevice, String> {

}
