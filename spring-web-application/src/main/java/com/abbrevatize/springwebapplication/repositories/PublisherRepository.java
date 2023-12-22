package com.abbrevatize.springwebapplication.repositories;

import com.abbrevatize.springwebapplication.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
