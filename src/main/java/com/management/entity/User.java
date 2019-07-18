package com.management.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;

    private String firstName;

    private String lastName;

    private Integer exp;

    private String skill;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "skills_users",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "skillId"))
    private List<Skill> skills = new ArrayList<>();

    public User(Integer userId, String firstName, String lastName, Integer exp,
                String skill, List<Skill> skills) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.exp = exp;
        this.skill = skill;
        this.skills = skills;
        this.skills.forEach(x -> x.getUsers().add(this));
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
