package com.studygazelle.datasetgenerator.Services;

import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRow;
import com.studygazelle.datasetgenerator.Entity.GeneratorDatasetRowChat;
import com.studygazelle.datasetgenerator.Interface.GeneratorDatasetRowRepository;
import com.studygazelle.datasetgenerator.Interface.GeneratorDatasetRowChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneratorDatasetRowService {

    @Autowired
    private GeneratorDatasetRowRepository datasetRowRepository;

    @Autowired
    private GeneratorDatasetRowChatRepository datasetRowChatRepository;

    // Get Dataset Row with QA
    public GeneratorDatasetRow getDatasetRowQA(Long rowId) {
        return datasetRowRepository.findById(rowId).orElse(null);
    }

    // Create Dataset Row and associated Chats
    public List<GeneratorDatasetRowChat> createDatasetRow(
            String firstQuestion, Long datasetId, Integer totalInputTokens, Integer totalOutputTokens,
            List<GeneratorDatasetRowChat> conversations) {

        // Create the dataset row
        GeneratorDatasetRow datasetRow = new GeneratorDatasetRow();
        //datasetRow.setGeneratorDataset(datasetId);
        datasetRow.setFirstQuestion(firstQuestion);
        datasetRow.setTotalInputTokens(totalInputTokens);
        datasetRow.setTotalOutputTokens(totalOutputTokens);

        datasetRow = datasetRowRepository.save(datasetRow);

        // Create the chats associated with the dataset row
        List<GeneratorDatasetRowChat> fullConversation = new ArrayList<>();
        for (GeneratorDatasetRowChat chat : conversations) {
            chat.setDatasetRowId(datasetRow.getId());
            GeneratorDatasetRowChat savedChat = datasetRowChatRepository.save(chat);
            fullConversation.add(savedChat);
        }

        return fullConversation;
    }
}
