package org.xulalex.demo.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.xulalex.demo.model.entities.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
