package com.studygazelle.datasetgenerator.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "generator_dataset")
public class GeneratorDataset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subtitle;
    private Long projectId;
    private String questioningSystemPrompt;
    private String answeringSystemPrompt;

    @OneToMany(mappedBy = "generatorDataset", cascade = CascadeType.ALL)
    private List<GeneratorDatasetRow> generatorDatasetRows;

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

    public String getQuestioningSystemPrompt() {
        return questioningSystemPrompt;
    }

    public void setQuestioningSystemPrompt(String questioningSystemPrompt) {
        this.questioningSystemPrompt = questioningSystemPrompt;
    }

    public String getAnsweringSystemPrompt() {
        return answeringSystemPrompt;
    }

    public void setAnsweringSystemPrompt(String answeringSystemPrompt) {
        this.answeringSystemPrompt = answeringSystemPrompt;
    }

    public List<GeneratorDatasetRow> getGeneratorDatasetRows() {
        return generatorDatasetRows;
    }

    public void setGeneratorDatasetRows(List<GeneratorDatasetRow> generatorDatasetRows) {
        this.generatorDatasetRows = generatorDatasetRows;
    }
}



