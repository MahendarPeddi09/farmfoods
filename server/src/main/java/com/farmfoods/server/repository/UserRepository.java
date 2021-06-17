package com.farmfoods.server.repository;

import com.farmfoods.server.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByUserName(String uerId);
}
