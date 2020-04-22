package com.example.students.repository;

import com.example.students.entities.ClassRoom;
import com.example.students.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);
}
