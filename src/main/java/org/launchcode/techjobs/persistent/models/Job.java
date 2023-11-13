package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
    //many to one relationship to employers
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
