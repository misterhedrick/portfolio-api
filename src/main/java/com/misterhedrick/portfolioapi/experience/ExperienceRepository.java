package com.misterhedrick.portfolioapi.experience;

import com.misterhedrick.portfolioapi.experience.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
}
