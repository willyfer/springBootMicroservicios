package com.microservice.student.microservice_student.service;

import com.microservice.student.microservice_student.entities.StudentEntity;

import java.util.List;

public interface IStudentService {
    List<StudentEntity> findall();
    StudentEntity findById(Long id);
    void save (StudentEntity student);
    List<StudentEntity> findByIdCourse (Long idCourse);
}
