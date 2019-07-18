package com.management.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="skills")
public class Skill  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skillId", unique = true)
    private Integer skillId;

    @Column(unique = true, length = 512)
    private String name;

    @ManyToMany(mappedBy = "skills")
    private List<User> users = new ArrayList<>();

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
