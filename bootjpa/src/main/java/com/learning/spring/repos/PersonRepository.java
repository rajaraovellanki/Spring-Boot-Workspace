package com.learning.spring.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.learning.spring.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>
{
	/*
	 * Methods that will be implemented by the Spring Container automatically
	 * should follow the patterns - 
	 * findByAttribute or findByAttribiteGreaterThan/findByAttributeLessThan
	 */
	List<Person> findByName(String name);
	
	List<Person> findByAgeGreaterThan(int age);
	
	List<Person> findByIdLessThan(int id);
	
	
	//You can add your own method in order to execute a complex JPQL query
	@Query("FROM Person WHERE AGE>?1 ORDER BY name DESC")
	List<Person> findByAgeGreaterThanSortedByName(int age);
}
