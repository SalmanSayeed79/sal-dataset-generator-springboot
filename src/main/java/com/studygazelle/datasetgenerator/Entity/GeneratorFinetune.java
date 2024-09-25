package com.studygazelle.datasetgenerator.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "generator_finetune")
public class GeneratorFinetune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subtitle;
    private String model;
    private Long projectId; // Assuming project_id is a foreign key

    private String fileId; // Assuming you want to store a file ID
    private String finetuneId; // Assuming you have this field as well
    private String modelName; // Assuming you have this field as well

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFinetuneId() {
        return finetuneId;
    }

    public void setFinetuneId(String finetuneId) {
        this.finetuneId = finetuneId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}