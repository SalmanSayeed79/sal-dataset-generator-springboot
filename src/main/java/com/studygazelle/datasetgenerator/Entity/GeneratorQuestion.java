package com.studygazelle.datasetgenerator.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "generator_question")
public class GeneratorQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private Boolean used;

    @ManyToOne
    @JoinColumn(name = "set_id", insertable = false, updatable = false)
    private GeneratorQuestionSet generatorQuestionSet;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public GeneratorQuestionSet getGeneratorQuestionSet() {
        return generatorQuestionSet;
    }

    public void setGeneratorQuestionSet(GeneratorQuestionSet generatorQuestionSet) {
        this.generatorQuestionSet = generatorQuestionSet;
    }
}