package com.learning.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learning.spring.model.Student;

/*
 * Spring boot will provide the CRUD operations
 * when you use the annotation @RepositoryRestResource
 * 
 * We need to provide the attributes for 
 * the path(path) and the relation name(collectionResourceRel)
 */
@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRestRepository extends JpaRepository<Student, Integer>
{

}
