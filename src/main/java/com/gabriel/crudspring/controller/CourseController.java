package com.gabriel.crudspring.controller;

import com.gabriel.crudspring.model.Course;
import com.gabriel.crudspring.repository.CourserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")


public class CourseController {


    public CourseController(CourserRepository courserRepository) {
        this.courserRepository = courserRepository;
    }

    private final CourserRepository courserRepository;

    @GetMapping
    public List<Course> list() {
        return courserRepository.findAll();
    }

    @Bean
    CommandLineRunner initDatabse (CourserRepository courserRepository){
        return args -> {
            courserRepository.deleteAll();

            Course c = new Course();
            c.setName("Angular com Spring");
            c.setCategory("front-end");

            courserRepository.save(c);

        };
    }



}
