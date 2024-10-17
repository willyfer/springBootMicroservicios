package com.microservice.course.microservice_course.service;

import com.microservice.course.microservice_course.entities.CourseEntity;
import com.microservice.course.microservice_course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<CourseEntity> findAll();
    CourseEntity findById(Long id);
    void save(CourseEntity course);
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
