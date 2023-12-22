package com.abbrevatize.springwebapplication.repositories;

import com.abbrevatize.springwebapplication.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
