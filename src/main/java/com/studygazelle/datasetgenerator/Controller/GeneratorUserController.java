package com.studygazelle.datasetgenerator.Controller;

import com.studygazelle.datasetgenerator.Entity.GeneratorUser;
import com.studygazelle.datasetgenerator.Services.GeneratorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class GeneratorUserController {

    @Autowired
    private GeneratorUserService userService;

    // Create a new user
    @PostMapping("/create")
    public GeneratorUser createUser(@RequestBody GeneratorUser user) {
        return userService.createUser(user);
    }

    // Get user by email
    @GetMapping("/email/{email}")
    public GeneratorUser getUserWithEmail(@PathVariable String email) {
        return userService.getUserWithEmail(email);
    }
}
