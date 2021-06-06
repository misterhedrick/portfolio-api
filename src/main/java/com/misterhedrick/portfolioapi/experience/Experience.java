package com.misterhedrick.portfolioapi.experience;

import com.misterhedrick.portfolioapi.highlight.Highlight;

import javax.persistence.*;
import java.sql.Array;
import java.util.List;


@Entity
public class Experience {
    @Id
    @GeneratedValue
    private Integer id;
    private String dates;
    private String title;
    private String employer;
    @OneToMany(mappedBy = "experience", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Highlight> highlights;


    public Experience() {
    }
    public Experience(String dates, String title, String employer) {
        this.dates = dates;
        this.title = title;
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", dates='" + dates + '\'' +
                ", title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", highlights=" + highlights +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public List<Highlight> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<Highlight> highlights) {
        this.highlights = highlights;
    }
}

