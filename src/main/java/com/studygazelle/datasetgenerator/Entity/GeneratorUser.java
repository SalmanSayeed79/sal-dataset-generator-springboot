package com.studygazelle.datasetgenerator.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "generator_user")
public class GeneratorUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String gender;
    private String occupation;
    private String degree;
    private String llmUsage; // Assuming this is a string
    private String topic;
    private String learningPeriod; // Assuming this is a string

    // Getters and Setters
}