package com.microservice.course.microservice_course.client;

import com.microservice.course.microservice_course.controller.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    @GetMapping("/search-by-course/{id}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long id);
}
