package com.studygazelle.datasetgenerator.Controller;

import com.studygazelle.datasetgenerator.Entity.GeneratorFinetune;
import com.studygazelle.datasetgenerator.Services.GeneratorFinetuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/finetunes")
public class GeneratorFinetuneController {

    @Autowired
    private GeneratorFinetuneService finetuneService;

    // Get finetunes by project ID
    @GetMapping("/project/{projectId}")
    public List<GeneratorFinetune> getProjectFinetunes(@PathVariable Long projectId) {
        return finetuneService.getProjectFinetunes(projectId);
    }

    // Get finetune by ID
    @GetMapping("/{finetuneId}")
    public GeneratorFinetune getFinetuneById(@PathVariable Long finetuneId) {
        return finetuneService.getFinetuneById(finetuneId);
    }

    // Create finetune
    @PostMapping("/create")
    public GeneratorFinetune createFinetune(@RequestBody GeneratorFinetune finetune) {
        return finetuneService.createFinetune(finetune);
    }

    // Update finetune title
    @PutMapping("/{ftId}/title")
    public GeneratorFinetune updateFinetuneTitle(@PathVariable Long ftId, @RequestBody String newTitle) {
        return finetuneService.updateFinetuneTitle(ftId, newTitle);
    }

    // Update finetune subtitle
    @PutMapping("/{ftId}/subtitle")
    public GeneratorFinetune updateFinetuneSubtitle(@PathVariable Long ftId, @RequestBody String newSubtitle) {
        return finetuneService.updateFinetuneSubtitle(ftId, newSubtitle);
    }

    // Update finetune file ID
    @PutMapping("/{ftId}/file-id")
    public GeneratorFinetune updateFinetuneFileId(@PathVariable Long ftId, @RequestBody String fileId) {
        return finetuneService.updateFinetuneFileId(ftId, fileId);
    }

    // Update finetune ID
    @PutMapping("/{ftId}/finetune-id")
    public GeneratorFinetune updateFinetuneId(@PathVariable Long ftId, @RequestBody String finetuneId) {
        return finetuneService.updateFinetuneId(ftId, finetuneId);
    }

    // Update finetune model name
    @PutMapping("/{ftId}/model-name")
    public GeneratorFinetune updateFinetuneModelName(@PathVariable Long ftId, @RequestBody String modelName) {
        return finetuneService.updateFinetuneModelName(ftId, modelName);
    }
}