package com.gabriel.crudspring.repository;


import com.gabriel.crudspring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourserRepository extends JpaRepository <Course, Long> {

}
