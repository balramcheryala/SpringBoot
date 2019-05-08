package com.sutiboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sutiboot.domain.Person;


/**
 * @className:com.sutiboot.repository.PersonRepository.java
 * @author <a href="mailto:balramc@****.**">Balram</a>
 * @date May 8, 2019 11:12:39 AM
 * @description:
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
