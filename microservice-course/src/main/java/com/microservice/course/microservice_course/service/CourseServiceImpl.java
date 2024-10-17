package com.microservice.course.microservice_course.service;

import com.microservice.course.microservice_course.client.StudentClient;
import com.microservice.course.microservice_course.controller.dto.StudentDTO;
import com.microservice.course.microservice_course.entities.CourseEntity;
import com.microservice.course.microservice_course.http.response.StudentByCourseResponse;
import com.microservice.course.microservice_course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;
    @Override
    public List<CourseEntity> findAll() {
        return (List<CourseEntity> )courseRepository.findAll();
    }

    @Override
    public CourseEntity findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(CourseEntity course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {
        // CONSULTAR EL CURSO
        CourseEntity course = courseRepository.findById(idCourse).orElse(new CourseEntity());
        // OBTENER LOS ESTUDANTES CONECTAR CON EL MSVC STUDANTES
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
