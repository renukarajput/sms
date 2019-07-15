package com.management.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name= "userSkillSet")
@Entity
public class UserSkillSet {
    Integer uId;
    Integer sId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
}
