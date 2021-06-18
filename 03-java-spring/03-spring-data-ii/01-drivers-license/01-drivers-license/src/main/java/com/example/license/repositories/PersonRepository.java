package com.example.license.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.license.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll(); //for dropdown
// 	List<Person> findByNoLicense();
 	List<Person> findByLicenseIdIsNull();
}
