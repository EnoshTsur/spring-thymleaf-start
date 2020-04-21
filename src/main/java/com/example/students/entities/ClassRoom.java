package com.example.students.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@Entity
@Table(name = "class_room")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "title", nullable = false, unique = true, length = 50)
    private String title;

    @OneToMany(
            mappedBy = "classRoom",
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER
    )
    public Set<Student> students = new HashSet<>();

    public  ClassRoom() {}

    public ClassRoom(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
