package com.misterhedrick.portfolioapi.achievement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Achievement {
    @Id
    @GeneratedValue
    private Integer id;
    private String description;

    public Achievement() {
    }

    public Achievement(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
