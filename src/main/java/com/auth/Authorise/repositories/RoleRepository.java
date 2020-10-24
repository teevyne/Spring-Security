package com.auth.Authorise.repositories;

import com.auth.Authorise.models.ERole;
import com.auth.Authorise.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
