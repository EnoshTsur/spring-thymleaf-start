package com.example.students.system;

import com.example.students.entities.ClassRoom;
import com.example.students.entities.Student;
import com.example.students.repository.ClassRoomRepository;
import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Scope("singleton")
@Component
public class College {

    private StudentRepository studentRepository;
    private ClassRoomRepository classRoomRepository;

    @Autowired
    public College(StudentRepository studentRepository, ClassRoomRepository classRoomRepository) {
        this.studentRepository = studentRepository;
        this.classRoomRepository = classRoomRepository;
    }


    public ClassRoom createClassRoom(ClassRoom classRoom, Set<Student> students) throws Exception {
        students.forEach(student -> {
            student.setClassRoom(classRoom);
            classRoom.getStudents().add(student);
        });

        classRoomRepository.save(classRoom);
        studentRepository.saveAll(students);
        return classRoom;
    }

    public List<Student> findByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }
}
