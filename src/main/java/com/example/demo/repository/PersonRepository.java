package com.example.demo.repository;

import com.example.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    //List<Person> findByTitleContainingOrContentContaining(String text, String textAgain);
}