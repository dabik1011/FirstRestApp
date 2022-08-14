package com.yelnitski.FirstRestApp.service;

import com.yelnitski.FirstRestApp.model.Person;
import com.yelnitski.FirstRestApp.repository.PeopleRepository;
import com.yelnitski.FirstRestApp.util.PersonNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> findAll() {
        return peopleRepository.findAll();
    }

    public Person findOne(int id) {
        return peopleRepository.findById(id).orElseThrow(PersonNotFoundException::new);
    }

    @Transactional
    public void save(Person person) {
        peopleRepository.save(person);
    }
}
