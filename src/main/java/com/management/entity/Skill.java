package com.management.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="skillSet")
@Entity
public class Skill {
    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
