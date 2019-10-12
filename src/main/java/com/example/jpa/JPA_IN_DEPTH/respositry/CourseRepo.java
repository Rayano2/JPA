package com.example.jpa.JPA_IN_DEPTH.respositry;

import com.example.jpa.JPA_IN_DEPTH.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
@Repository
public class CourseRepo {


    @Autowired
    EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class, id);

    }
    }
