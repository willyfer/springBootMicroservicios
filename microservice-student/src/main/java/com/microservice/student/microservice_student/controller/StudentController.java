package com.microservice.student.microservice_student.controller;

import com.microservice.student.microservice_student.entities.StudentEntity;
import com.microservice.student.microservice_student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
     public void saveStudent (@RequestBody StudentEntity student){
            iStudentService.save(student);
     }

     @GetMapping("/all")
     public ResponseEntity<?> findAllStudent (){
        return ResponseEntity.ok(iStudentService.findall());
     }

     @GetMapping("/search/{id}")
     public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(iStudentService.findById(id));
     }

     @GetMapping("/search-by-course/{idCourse}")
    public ResponseEntity<?> searchByCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(iStudentService.findByIdCourse(idCourse));

     }

}
