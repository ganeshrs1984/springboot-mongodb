package com.tech.springbootmangodb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tech.springbootmangodb.domain.Appartment;

public interface AppartmentRepository extends MongoRepository<Appartment,String>{

}
