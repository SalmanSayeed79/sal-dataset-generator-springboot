package com.studygazelle.datasetgenerator.Interface;
import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GeneratorDatasetRowRepository extends JpaRepository<GeneratorDatasetRow, Long> {
}
