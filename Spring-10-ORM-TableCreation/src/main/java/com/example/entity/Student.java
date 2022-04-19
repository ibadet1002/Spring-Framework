package com.example.entity;

import com.example.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "studentFirstName")
    private String firstName; //display as first_name on table
    @Column(name = "studentLastName")
    private String lastName;
    @Column(name = "studentEmail")
    private String email;

    @Transient  // does not display on table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
