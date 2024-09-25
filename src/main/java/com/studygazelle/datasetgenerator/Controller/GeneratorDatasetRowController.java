package com.studygazelle.datasetgenerator.Controller;

import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRow;
import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRowChat;
import com.studygazelle.datasetgenerator.Services.GeneratorDatasetRowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dataset-rows")
public class GeneratorDatasetRowController {

    @Autowired
    private GeneratorDatasetRowService datasetRowService;

    // Get Dataset Row with QA
    @GetMapping("/{rowId}")
    public GeneratorDatasetRow getDatasetRowQA(@PathVariable Long rowId) {
        return datasetRowService.getDatasetRowQA(rowId);
    }

    // Create Dataset Row and associated Chats
    @PostMapping("/create")
    public List<GeneratorDatasetRowChat> createDatasetRow(
            @RequestParam String firstQuestion,
            @RequestParam Long datasetId,
            @RequestParam Integer totalInputTokens,
            @RequestParam Integer totalOutputTokens,
            @RequestBody List<GeneratorDatasetRowChat> conversations) {
        return datasetRowService.createDatasetRow(firstQuestion, datasetId, totalInputTokens, totalOutputTokens, conversations);
    }
}