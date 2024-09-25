package com.studygazelle.datasetgenerator.Entity;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "generator_question_set")
public class GeneratorQuestionSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subtitle;
    private Long projectId; // Assuming project_id is a foreign key

    @OneToMany(mappedBy = "generatorQuestionSet", cascade = CascadeType.ALL)
    private List<GeneratorQuestion> questions;

    // Getters and Setters

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public List<GeneratorQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<GeneratorQuestion> questions) {
        this.questions = questions;
    }
}


