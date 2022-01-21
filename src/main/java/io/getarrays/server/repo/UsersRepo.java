package io.getarrays.server.repo;

import io.getarrays.server.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository <Users, Long> {

    Users findById(int id);
}
