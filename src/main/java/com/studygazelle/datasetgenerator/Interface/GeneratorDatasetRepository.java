package com.studygazelle.datasetgenerator.Interface;

import com.studygazelle.datasetgenerator.Entity.GeneratorDataset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneratorDatasetRepository extends JpaRepository<GeneratorDataset, Long> {
    List<GeneratorDataset> findByProjectId(Long projectId);
}