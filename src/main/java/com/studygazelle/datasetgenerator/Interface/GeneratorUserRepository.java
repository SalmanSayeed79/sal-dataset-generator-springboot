package com.studygazelle.datasetgenerator.Interface;

import com.studygazelle.datasetgenerator.Entity.GeneratorUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratorUserRepository extends JpaRepository<GeneratorUser, Long> {
    GeneratorUser findByEmail(String email);
}
