package com.example.javaAndVue.Service.Impl;

import com.example.javaAndVue.Dto.StudentRepository;
import com.example.javaAndVue.Model.Student;
import com.example.javaAndVue.Service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getList() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
