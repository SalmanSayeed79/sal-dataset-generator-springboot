package com.studygazelle.datasetgenerator.Services;

import com.studygazelle.datasetgenerator.Entity.GeneratorFinetune;
import com.studygazelle.datasetgenerator.Interface.GeneratorFinetuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneratorFinetuneService {

    @Autowired
    private GeneratorFinetuneRepository finetuneRepository;

    // Get finetunes by project ID
    public List<GeneratorFinetune> getProjectFinetunes(Long projectId) {
        return finetuneRepository.findByProjectId(projectId);
    }

    // Get finetune by ID
    public GeneratorFinetune getFinetuneById(Long finetuneId) {
        return finetuneRepository.findById(finetuneId).orElse(null);
    }

    // Create finetune
    public GeneratorFinetune createFinetune(GeneratorFinetune finetune) {
        return finetuneRepository.save(finetune);
    }

    // Update title
    public GeneratorFinetune updateFinetuneTitle(Long ftId, String newTitle) {
        GeneratorFinetune finetune = finetuneRepository.findById(ftId).orElse(null);
        if (finetune != null) {
            finetune.setTitle(newTitle);
            return finetuneRepository.save(finetune);
        }
        return null;
    }

    // Update subtitle
    public GeneratorFinetune updateFinetuneSubtitle(Long ftId, String newSubtitle) {
        GeneratorFinetune finetune = finetuneRepository.findById(ftId).orElse(null);
        if (finetune != null) {
            finetune.setSubtitle(newSubtitle);
            return finetuneRepository.save(finetune);
        }
        return null;
    }

    // Update file ID
    public GeneratorFinetune updateFinetuneFileId(Long ftId, String fileId) {
        GeneratorFinetune finetune = finetuneRepository.findById(ftId).orElse(null);
        if (finetune != null) {
            finetune.setFileId(fileId);
            return finetuneRepository.save(finetune);
        }
        return null;
    }

    // Update finetune ID
    public GeneratorFinetune updateFinetuneId(Long ftId, String finetuneId) {
        GeneratorFinetune finetune = finetuneRepository.findById(ftId).orElse(null);
        if (finetune != null) {
            finetune.setFinetuneId(finetuneId);
            return finetuneRepository.save(finetune);
        }
        return null;
    }

    // Update model name
    public GeneratorFinetune updateFinetuneModelName(Long ftId, String modelName) {
        GeneratorFinetune finetune = finetuneRepository.findById(ftId).orElse(null);
        if (finetune != null) {
            finetune.setModelName(modelName);
            return finetuneRepository.save(finetune);
        }
        return null;
    }
}