package com.hsr.demo.application.repository.user;

import com.hsr.demo.application.model.user.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
}
