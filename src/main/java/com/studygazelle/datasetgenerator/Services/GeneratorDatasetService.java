package com.studygazelle.datasetgenerator.Services;


import com.studygazelle.datasetgenerator.Entity.GeneratorDataset;
import com.studygazelle.datasetgenerator.Interface.GeneratorDatasetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneratorDatasetService {

    @Autowired
    private GeneratorDatasetRepository datasetRepository;

    // Get datasets by project ID
    public List<GeneratorDataset> getProjectDatasets(Long projectId) {
        return datasetRepository.findByProjectId(projectId);
    }

    // Get dataset by ID
    public GeneratorDataset getDatasetById(Long datasetId) {
        return datasetRepository.findById(datasetId).orElse(null);
    }

    // Create dataset
    public GeneratorDataset createDataset(GeneratorDataset dataset) {
        return datasetRepository.save(dataset);
    }

    // Update title
    public GeneratorDataset updateTitle(Long datasetId, String newTitle) {
        GeneratorDataset dataset = datasetRepository.findById(datasetId).orElse(null);
        if (dataset != null) {
            dataset.setTitle(newTitle);
            return datasetRepository.save(dataset);
        }
        return null;
    }

    // Update subtitle
    public GeneratorDataset updateSubtitle(Long datasetId, String newSubtitle) {
        GeneratorDataset dataset = datasetRepository.findById(datasetId).orElse(null);
        if (dataset != null) {
            dataset.setSubtitle(newSubtitle);
            return datasetRepository.save(dataset);
        }
        return null;
    }

    // Update questioning system prompt
    public GeneratorDataset updateQuestioningSystemPrompt(Long datasetId, String newPrompt) {
        GeneratorDataset dataset = datasetRepository.findById(datasetId).orElse(null);
        if (dataset != null) {
            dataset.setQuestioningSystemPrompt(newPrompt);
            return datasetRepository.save(dataset);
        }
        return null;
    }

    // Update answering system prompt
    public GeneratorDataset updateAnsweringSystemPrompt(Long datasetId, String newPrompt) {
        GeneratorDataset dataset = datasetRepository.findById(datasetId).orElse(null);
        if (dataset != null) {
            dataset.setAnsweringSystemPrompt(newPrompt);
            return datasetRepository.save(dataset);
        }
        return null;
    }
}
