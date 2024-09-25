package com.studygazelle.datasetgenerator.Services;

import com.studygazelle.datasetgenerator.Entity.GeneratorProject;
import com.studygazelle.datasetgenerator.Interface.GeneratorProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneratorProjectService {

    @Autowired
    private GeneratorProjectRepository projectRepository;

    // Get projects by user ID
    public List<GeneratorProject> getUserProjects(Long userId) {
        return projectRepository.findByOwnerId(userId);
    }

    // Create a new project
    public GeneratorProject createProject(GeneratorProject project) {
        return projectRepository.save(project);
    }
}