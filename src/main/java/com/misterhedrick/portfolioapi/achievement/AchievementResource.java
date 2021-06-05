package com.misterhedrick.portfolioapi.achievement;

import com.misterhedrick.portfolioapi.achievement.Achievement;
import com.misterhedrick.portfolioapi.achievement.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AchievementResource {

    @Autowired
    private AchievementRepository achievementRepo;

    @GetMapping("/achievements")
    public List<Achievement> retrieveAllAchievements() {
        return achievementRepo.findAll();
    }
}
