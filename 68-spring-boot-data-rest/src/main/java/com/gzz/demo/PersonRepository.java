package com.gzz.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	List<Person> findByNameStartsWith(@Param("name") String name);
}
