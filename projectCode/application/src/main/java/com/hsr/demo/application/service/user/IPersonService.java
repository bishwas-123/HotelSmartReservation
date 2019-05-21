package com.hsr.demo.application.service.user;

import com.hsr.demo.application.model.user.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();
    Person save(Person person);
    Person finById(Integer personId);
}
