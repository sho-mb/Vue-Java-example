package com.example.javaAndVue.Service;

import com.example.javaAndVue.Model.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    List<Student> getList();

    void delete(Integer id);
}
