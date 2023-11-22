package com.example.javaAndVue.Controller;

import com.example.javaAndVue.Form.StudentForm;
import com.example.javaAndVue.Model.Student;
import com.example.javaAndVue.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @GetMapping
    public List<Student> getList() {
        return studentService.getList();
    }

    @CrossOrigin(origins =
            "http://127.0.0.1:5173")
    @PostMapping("/add")
    public void add(@RequestBody StudentForm studentForm) throws Exception {
        if ((!studentForm.firstname().isEmpty()) && (!studentForm.lastname().isEmpty())) {
            Student student = new Student();
            student.setFirstname(studentForm.firstname());
            student.setLastname(studentForm.lastname());
            studentService.add(student);
        } else {
            throw new Exception("Can not be empty");
        }
    }

    @CrossOrigin(origins =
            "http://127.0.0.1:5173")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        studentService.delete(id);
    }
}
