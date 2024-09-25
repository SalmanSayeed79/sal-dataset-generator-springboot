package com.studygazelle.datasetgenerator.Services;

import com.studygazelle.datasetgenerator.Entity.GeneratorQuestion;
import com.studygazelle.datasetgenerator.Entity.GeneratorQuestionSet;
import com.studygazelle.datasetgenerator.Interface.GeneratorQuestionRepository;
import com.studygazelle.datasetgenerator.Interface.GeneratorQuestionSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneratorQuestionSetService {

    @Autowired
    private GeneratorQuestionSetRepository questionSetRepository;

    @Autowired
    private GeneratorQuestionRepository questionRepository;

    // Get question sets by project ID
    public List<GeneratorQuestionSet> getProjectQuestionSets(Long projectId) {
        return questionSetRepository.findByProjectId(projectId);
    }

    // Get question set by ID
    public GeneratorQuestionSet getQuestionsetById(Long qId) {
        return questionSetRepository.findById(qId).orElse(null);
    }

    // Create a new question set
    public GeneratorQuestionSet createProjectQuestionSet(GeneratorQuestionSet questionSet) {
        return questionSetRepository.save(questionSet);
    }

    // Get questions by set ID
//    public List<GeneratorQuestion> getQuestionsBySet(Long setId) {
//        return questionRepository.findAllById(setId);
//    }

    // Create a new question
    public GeneratorQuestion createSetQuestion(GeneratorQuestion question) {
        return questionRepository.save(question);
    }

    // Update question set title
    public GeneratorQuestionSet updateQuestionSetTitle(Long qsId, String newTitle) {
        GeneratorQuestionSet questionSet = questionSetRepository.findById(qsId).orElse(null);
        if (questionSet != null) {
            questionSet.setTitle(newTitle);
            return questionSetRepository.save(questionSet);
        }
        return null;
    }

    // Update question set subtitle
    public GeneratorQuestionSet updateQuestionSetSubtitle(Long qsId, String newSubtitle) {
        GeneratorQuestionSet questionSet = questionSetRepository.findById(qsId).orElse(null);
        if (questionSet != null) {
            questionSet.setSubtitle(newSubtitle);
            return questionSetRepository.save(questionSet);
        }
        return null;
    }
}