package com.digicl.springbootjpalearning.repositories;

import com.digicl.springbootjpalearning.entities.EntityStudentsrecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRecordRepository extends JpaRepository<EntityStudentsrecords,Integer> {
}
