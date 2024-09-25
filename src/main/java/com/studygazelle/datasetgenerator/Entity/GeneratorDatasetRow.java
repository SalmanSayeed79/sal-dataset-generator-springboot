package com.studygazelle.datasetgenerator.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "generator_dataset_row")
public class GeneratorDatasetRow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String firstQuestion; // Added field
    private Integer totalInputTokens; // Added field
    private Integer totalOutputTokens; // Added field

    @ManyToOne
    @JoinColumn(name = "dataset_id")
    private GeneratorDataset generatorDataset;

    @OneToMany(mappedBy = "generatorDatasetRow", cascade = CascadeType.ALL)
    private List<GeneratorDatasetRowChat> chats;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GeneratorDataset getGeneratorDataset() {
        return generatorDataset;
    }

    public void setGeneratorDataset(GeneratorDataset generatorDataset) {
        this.generatorDataset = generatorDataset;
    }

    public List<GeneratorDatasetRowChat> getChats() {
        return chats;
    }

    public void setChats(List<GeneratorDatasetRowChat> chats) {
        this.chats = chats;
    }



    public String getFirstQuestion() {
        return firstQuestion;
    }

    public void setFirstQuestion(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }

    public Integer getTotalInputTokens() {
        return totalInputTokens;
    }

    public void setTotalInputTokens(Integer totalInputTokens) {
        this.totalInputTokens = totalInputTokens;
    }

    public Integer getTotalOutputTokens() {
        return totalOutputTokens;
    }

    public void setTotalOutputTokens(Integer totalOutputTokens) {
        this.totalOutputTokens = totalOutputTokens;
    }
}
