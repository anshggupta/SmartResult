package com.SmartResult.SmartResult.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.Mapping;

import javax.lang.model.element.NestingKind;

@Entity
@Table
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private int marks;
    private int maxMarks;
    private String Remarks;
    private char grade;


    @ManyToOne
    Student student;


}
