package com.example.Student_Library.Repositories;

import com.example.Student_Library.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
