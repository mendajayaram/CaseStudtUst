package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;


@Service
public class StudentService 
{
	@Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> products) {
        return repository.saveAll(products);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudent(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Student> getStudentByName(String name) {
        return repository.findByName(name);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "student removed !! " + id;
    }

    public Student updateStudent(Student student)
    {
    	
    	Student existingStudent = repository.findById(student.getId()).orElse(null);
    	existingStudent.setName(student.getName());
    	existingStudent.setAddress(student.getAddress());
    	
        return repository.save(existingStudent);
    }
}
