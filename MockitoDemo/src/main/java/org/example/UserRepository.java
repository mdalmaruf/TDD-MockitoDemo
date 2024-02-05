package org.example;

public interface UserRepository {
    User findById(Long id);
    // Other methods like save, delete, etc. can be added as needed
}
