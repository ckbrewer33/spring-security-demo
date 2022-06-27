package com.brewer.ckbspringsecurity.repository;

import com.brewer.ckbspringsecurity.model.ERole;
import com.brewer.ckbspringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
