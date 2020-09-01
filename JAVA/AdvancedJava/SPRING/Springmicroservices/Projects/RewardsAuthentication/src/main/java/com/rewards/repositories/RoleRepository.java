package com.rewards.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.entities.Role;

/*Repository works with database*/
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Optional<Role> findByRole(String role);
}
