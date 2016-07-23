package com.bridgelabz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.domain.Person;

/**
 * Created by ekansh on 14/7/15.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
