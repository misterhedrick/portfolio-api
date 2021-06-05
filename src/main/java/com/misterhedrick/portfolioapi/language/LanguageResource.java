package com.misterhedrick.portfolioapi.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageResource {

    @Autowired
    private LanguageRepository languageRepo;

    @GetMapping("/languages")
    public List<Language> retrieveAllLanguages() {
        return languageRepo.findAll();
    }
}
