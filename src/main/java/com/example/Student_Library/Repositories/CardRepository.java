package com.example.Student_Library.Repositories;

import com.example.Student_Library.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
