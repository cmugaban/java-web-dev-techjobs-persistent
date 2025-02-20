
package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer) {

        super();
        this.employer = anEmployer;

    }

    public Employer getEmployer() {

        return employer;

    }

    public void setEmployer(Employer employer) {

        this.employer = employer;

    }

    public Iterable<Skill> getSkills() {

        return skills;

    }

    public void setSkills(List<Skill> skills) {

        this.skills = skills;

    }



}
