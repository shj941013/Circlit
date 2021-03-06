package com.circlit.repositories;

import com.circlit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Integer> {
//    User existsById(String userId);
//    boolean existsByUsername(String username);
//    boolean existByEmail(String email);
//    Optional<User> getUserByUsername(String username);
//    Optional<User> getUserByEmail(String email);
}
