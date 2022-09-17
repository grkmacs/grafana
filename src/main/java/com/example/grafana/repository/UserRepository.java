package com.example.grafana.repository;

import com.example.grafana.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    Boolean existsByUsername(String username);

    void deleteByUsername(String username);
}
