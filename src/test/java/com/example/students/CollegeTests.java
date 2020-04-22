package com.example.students;

import com.example.students.entities.ClassRoom;
import com.example.students.entities.Student;
import com.example.students.system.College;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
class CollegeTests {

    @Autowired
    private College college;


    @Test
    void contextLoads() {
    }

    @Test
    void findByFirstName() {
//        college.findByFirstName("Avi").forEach(System.out::println);
    }

    @Test
    void createClassRoom(){
//
//
//        Set<Student> newStudents = new HashMap<String, String>() {{
//            put("Avi", "Simha");
//            put("Eilon", "Nesher");
//            put("Yaron", "Liverpool");
//            put("Iftach", "Korgi");
//            put("Osnat", "Retriver");
//            put("Magic", "Ben Haiun");
//        }}
//                .entrySet()
//                .stream()
//                .map(entry -> new Student(entry.getKey(), entry.getValue()))
//                .collect(Collectors.toSet());
//
//        ClassRoom classRoom = new ClassRoom("Java");
//        try {
//            college.createClassRoom(classRoom, newStudents);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
