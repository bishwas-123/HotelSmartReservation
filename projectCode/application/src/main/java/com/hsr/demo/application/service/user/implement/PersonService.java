package com.hsr.demo.application.service.user.implement;



import com.hsr.demo.application.model.user.Person;

import com.hsr.demo.application.repository.user.IPersonRepository;
import com.hsr.demo.application.service.user.IPersonService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    private IPersonRepository personRepository;
    public PersonService(IPersonRepository personRepository){
        this.personRepository=personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll(Sort.by("firstName"));
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(Integer personId) {
        return personRepository.findById(personId).orElse(null);
    }
}
