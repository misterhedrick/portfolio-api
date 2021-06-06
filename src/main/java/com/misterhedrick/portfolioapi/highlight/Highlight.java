package com.misterhedrick.portfolioapi.highlight;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Highlight {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer experience;
    private String description;

    public Highlight() {
    }

    public Highlight(Integer experience, String description) {
        this.experience = experience;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Highlight{" +
                "id=" + id +
                ", experience=" + experience +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
