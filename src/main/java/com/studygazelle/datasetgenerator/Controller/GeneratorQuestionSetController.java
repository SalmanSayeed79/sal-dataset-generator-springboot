package com.studygazelle.datasetgenerator.Controller;

import com.studygazelle.datasetgenerator.Entity.GeneratorQuestion;
import com.studygazelle.datasetgenerator.Entity.GeneratorQuestionSet;
import com.studygazelle.datasetgenerator.Services.GeneratorQuestionSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question-sets")
public class GeneratorQuestionSetController {

    @Autowired
    private GeneratorQuestionSetService questionSetService;

    // Get question sets by project ID
    @GetMapping("/project/{projectId}")
    public List<GeneratorQuestionSet> getProjectQuestionSets(@PathVariable Long projectId) {
        return questionSetService.getProjectQuestionSets(projectId);
    }

    // Get question set by ID
    @GetMapping("/{qId}")
    public GeneratorQuestionSet getQuestionsetById(@PathVariable Long qId) {
        return questionSetService.getQuestionsetById(qId);
    }

    // Create a new question set
    @PostMapping("/create")
    public GeneratorQuestionSet createProjectQuestionSet(@RequestBody GeneratorQuestionSet questionSet) {
        return questionSetService.createProjectQuestionSet(questionSet);
    }

    // Get questions by set ID
//    @GetMapping("/{setId}/questions")
//    public List<GeneratorQuestion> getQuestionsBySet(@PathVariable Long setId) {
//        return questionSetService.getQuestionsBySet(setId);
//    }

    // Create a new question
    @PostMapping("/{setId}/questions/create")
    public GeneratorQuestion createSetQuestion(@PathVariable Long setId, @RequestBody GeneratorQuestion question) {
        //question.setSetId(setId);
        return questionSetService.createSetQuestion(question);
    }

    // Update question set title
    @PutMapping("/{qsId}/title")
    public GeneratorQuestionSet updateQuestionSetTitle(@PathVariable Long qsId, @RequestBody String newTitle) {
        return questionSetService.updateQuestionSetTitle(qsId, newTitle);
    }

    // Update question set subtitle
    @PutMapping("/{qsId}/subtitle")
    public GeneratorQuestionSet updateQuestionSetSubtitle(@PathVariable Long qsId, @RequestBody String newSubtitle) {
        return questionSetService.updateQuestionSetSubtitle(qsId, newSubtitle);
    }
}
