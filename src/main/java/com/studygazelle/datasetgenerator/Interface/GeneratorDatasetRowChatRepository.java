package com.studygazelle.datasetgenerator.Interface;

import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRowChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GeneratorDatasetRowChatRepository extends JpaRepository<GeneratorDatasetRowChat, Long> {
}