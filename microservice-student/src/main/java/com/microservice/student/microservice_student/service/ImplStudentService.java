package com.microservice.student.microservice_student.service;

import com.microservice.student.microservice_student.entities.StudentEntity;
import com.microservice.student.microservice_student.presistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplStudentService implements IStudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> findall() {
        return (List<StudentEntity>)studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(StudentEntity student) {
        studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> findByIdCourse(Long idCourse) {
        return (List<StudentEntity>)studentRepository.findAllStudent(idCourse);
    }

}
