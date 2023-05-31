package com.digicl.springbootjpalearning.services;

import com.digicl.springbootjpalearning.entities.EntityStudentsrecords;
import com.digicl.springbootjpalearning.modals.StudentModals;
import com.digicl.springbootjpalearning.repositories.StudentRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.Optional;

@Service
public class StudentRecords {

    @Autowired
    StudentRecordRepository studentRecordRepository;

    @Autowired
    ModelMapper modelMapper;

    public void addStudents(StudentModals student){
        EntityStudentsrecords entityStudentsrecords = modelMapper.map(student,EntityStudentsrecords.class);
        studentRecordRepository.saveAndFlush(entityStudentsrecords);
    }

    public StudentModals findById(int studentId){
        Optional<EntityStudentsrecords> entityStudentsrecords = studentRecordRepository.findById(studentId);
        if(entityStudentsrecords.isPresent()){
            return modelMapper.map(entityStudentsrecords, StudentModals.class);
        }
        return null;
    }
}