package com.yelnitski.FirstRestApp.repository;

import com.yelnitski.FirstRestApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
