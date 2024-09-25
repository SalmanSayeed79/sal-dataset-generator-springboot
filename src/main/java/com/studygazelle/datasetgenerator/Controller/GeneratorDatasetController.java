package com.studygazelle.datasetgenerator.Controller;


import com.studygazelle.datasetgenerator.Entity.GeneratorDataset;
import com.studygazelle.datasetgenerator.Services.GeneratorDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datasets")
public class GeneratorDatasetController {

    @Autowired
    private GeneratorDatasetService datasetService;

    // Get datasets by project ID
    @GetMapping("/project/{projectId}")
    public List<GeneratorDataset> getProjectDatasets(@PathVariable Long projectId) {
        return datasetService.getProjectDatasets(projectId);
    }

    // Get dataset by ID
    @GetMapping("/{datasetId}")
    public GeneratorDataset getDatasetById(@PathVariable Long datasetId) {
        return datasetService.getDatasetById(datasetId);
    }

    // Create dataset
    @PostMapping("/create")
    public GeneratorDataset createDataset(@RequestBody GeneratorDataset dataset) {
        return datasetService.createDataset(dataset);
    }

    // Update title
    @PutMapping("/{datasetId}/title")
    public GeneratorDataset updateTitle(@PathVariable Long datasetId, @RequestBody String newTitle) {
        return datasetService.updateTitle(datasetId, newTitle);
    }

    // Update subtitle
    @PutMapping("/{datasetId}/subtitle")
    public GeneratorDataset updateSubtitle(@PathVariable Long datasetId, @RequestBody String newSubtitle) {
        return datasetService.updateSubtitle(datasetId, newSubtitle);
    }

    // Update questioning system prompt
    @PutMapping("/{datasetId}/questioning-prompt")
    public GeneratorDataset updateQuestioningSystemPrompt(@PathVariable Long datasetId, @RequestBody String newPrompt) {
        return datasetService.updateQuestioningSystemPrompt(datasetId, newPrompt);
    }

    // Update answering system prompt
    @PutMapping("/{datasetId}/answering-prompt")
    public GeneratorDataset updateAnsweringSystemPrompt(@PathVariable Long datasetId, @RequestBody String newPrompt) {
        return datasetService.updateAnsweringSystemPrompt(datasetId, newPrompt);
    }
}
