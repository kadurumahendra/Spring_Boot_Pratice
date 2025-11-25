package com.example.SpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    private String name;


    private int experience;

    public Principal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Principal [name=" + name + ", experience=" + experience + "]";
    }
}
