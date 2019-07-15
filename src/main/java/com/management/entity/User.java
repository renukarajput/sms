package com.management.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "user")
@Entity
public class User {
    Integer id;
    String name;
    Integer exp;

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

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }
}
