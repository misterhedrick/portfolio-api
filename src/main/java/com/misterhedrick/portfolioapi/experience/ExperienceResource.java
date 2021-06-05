package com.misterhedrick.portfolioapi.experience;

import com.misterhedrick.portfolioapi.experience.Experience;
import com.misterhedrick.portfolioapi.experience.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceResource {

    @Autowired
    private ExperienceRepository experienceRepo;

    @GetMapping("/experiences")
    public List<Experience> retrieveAllExperiences() {
        return experienceRepo.findAll();
    }
}
