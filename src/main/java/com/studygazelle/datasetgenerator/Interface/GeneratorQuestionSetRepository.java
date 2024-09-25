package com.studygazelle.datasetgenerator.Interface;


import com.studygazelle.datasetgenerator.Entity.GeneratorQuestionSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneratorQuestionSetRepository extends JpaRepository<GeneratorQuestionSet, Long> {
    List<GeneratorQuestionSet> findByProjectId(Long projectId);
}
