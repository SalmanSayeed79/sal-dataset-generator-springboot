package com.studygazelle.datasetgenerator.Controller;

import com.studygazelle.datasetgenerator.Entity.GeneratorProject;
import com.studygazelle.datasetgenerator.Services.GeneratorProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class GeneratorProjectController {

    @Autowired
    private GeneratorProjectService projectService;

    // Get projects by user ID
    @GetMapping("/user/{userId}")
    public List<GeneratorProject> getUserProjects(@PathVariable Long userId) {
        return projectService.getUserProjects(userId);
    }

    // Create a new project
    @PostMapping("/create")
    public GeneratorProject createProject(@RequestBody GeneratorProject project) {
        return projectService.createProject(project);
    }
}
