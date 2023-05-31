package com.digicl.springbootjpalearning.repositories;

import com.digicl.springbootjpalearning.entities.EntityCoursename;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<EntityCoursename, Integer> {
}
