package com.studygazelle.datasetgenerator.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "generator_dataset_row_chat")
public class GeneratorDatasetRowChat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private Long datasetRowId;
    private String type;
    private String content;
    private String model;
    private Integer inputTokens;
    private Integer outputTokens;

    @ManyToOne
    @JoinColumn(name = "row_id")
    private GeneratorDatasetRow generatorDatasetRow;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GeneratorDatasetRow getGeneratorDatasetRow() {
        return generatorDatasetRow;
    }

    public void setGeneratorDatasetRow(GeneratorDatasetRow generatorDatasetRow) {
        this.generatorDatasetRow = generatorDatasetRow;
    }

    public Long getDatasetRowId() {
        return datasetRowId;
    }

    public void setDatasetRowId(Long datasetRowId) {
        this.datasetRowId = datasetRowId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    public Integer getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }
}
