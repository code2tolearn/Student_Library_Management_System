package com.example.Student_Library.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;

import java.util.Date;

@Entity
@Table(name = "Card")
public class Card {

    // save this card in Db
    // Before saving I have to set its Attributes Rule 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @CreationTimestamp // auto time stamp when entry is creayted
 private  Date createdOn ;

    @CreationTimestamp  // timestamp when the entry is updated
   private Date updatedOn ;

    // Sql does not understand that thing  have to convert this enum to string
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus ;  /// ENUM  card status


     public Card() {
    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    // mapping
    @OneToOne    // this is child class unidirectional Mapping is there and
    @JoinColumn
    Student studentVariableName ;  //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

//    public Student getStudent() {
//        return student;
//    }

//    public void setStudent(Student student) {
//        this.student = student;
//    }
}
