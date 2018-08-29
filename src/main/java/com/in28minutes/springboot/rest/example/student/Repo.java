package com.in28minutes.springboot.rest.example.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Invoice, Long>{

}
