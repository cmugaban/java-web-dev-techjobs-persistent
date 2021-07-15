package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    @NotBlank
    @NotNull
    @Size(message = "Location must be between 5 and 100 characters.", min = 5, max = 100)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;

    }

    public void setLocation(String location) {
        this.location = location;

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public Employer() {

    }


}


//@Entity
//public class Employer extends AbstractEntity {
//
//    @NotBlank(message = "Location is required")
//    private String location;
//
//    @OneToMany
//    @JoinColumn
//    private List<Job> employers = new ArrayList<>();
//
//    public Employer(String location) {
//        this.location = location;
//    }
//
//    public Employer() {}
//
//    public String getLocation() { return location; }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//}