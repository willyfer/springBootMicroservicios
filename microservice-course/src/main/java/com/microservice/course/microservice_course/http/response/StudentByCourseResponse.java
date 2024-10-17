package com.microservice.course.microservice_course.http.response;

import com.microservice.course.microservice_course.controller.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {
    private  String courseName;
    private  String teacher;
    private List<StudentDTO> studentDTOList;
}
