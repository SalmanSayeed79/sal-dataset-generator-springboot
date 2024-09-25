package com.studygazelle.datasetgenerator.Interface;

import com.studygazelle.datasetgenerator.Entity.GeneratorProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneratorProjectRepository extends JpaRepository<GeneratorProject, Long> {
    List<GeneratorProject> findByOwnerId(Long ownerId);
}
