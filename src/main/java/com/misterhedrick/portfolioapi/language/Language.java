package com.misterhedrick.portfolioapi.language;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Language {
    @Id
    @GeneratedValue
    private Integer id;
    private String value;
    private String icon;

    public Language() {
    }

    public Language(String value, String icon) {
        this.value = value;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
