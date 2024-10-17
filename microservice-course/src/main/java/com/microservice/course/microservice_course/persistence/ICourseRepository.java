package com.microservice.course.microservice_course.persistence;

import com.microservice.course.microservice_course.entities.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<CourseEntity, Long> {

}
