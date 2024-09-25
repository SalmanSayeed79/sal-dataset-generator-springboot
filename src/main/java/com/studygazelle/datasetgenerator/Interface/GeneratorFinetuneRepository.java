package com.studygazelle.datasetgenerator.Interface;

import com.studygazelle.datasetgenerator.Entity.GeneratorFinetune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneratorFinetuneRepository extends JpaRepository<GeneratorFinetune, Long> {
    List<GeneratorFinetune> findByProjectId(Long projectId);
}