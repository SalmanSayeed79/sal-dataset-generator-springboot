package com.studygazelle.datasetgenerator.Services;

import com.studygazelle.datasetgenerator.Entity.GeneratorUser;
import com.studygazelle.datasetgenerator.Interface.GeneratorUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneratorUserService {

    @Autowired
    private GeneratorUserRepository userRepository;

    // Create a new user
    public GeneratorUser createUser(GeneratorUser user) {
        return userRepository.save(user);
    }

    // Get user by email
    public GeneratorUser getUserWithEmail(String email) {
        return userRepository.findByEmail(email);
    }
}