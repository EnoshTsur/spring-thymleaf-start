package com.example.students.repository;

import com.example.students.entities.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {
}
