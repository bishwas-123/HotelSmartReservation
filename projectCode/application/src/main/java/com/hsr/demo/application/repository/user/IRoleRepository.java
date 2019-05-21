package com.hsr.demo.application.repository.user;

import com.hsr.demo.application.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
