package com.management.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name= "user_skills")
@Entity
public class UserSkillSet {
    @Id
    @Column(name = "UserId")
    @NotNull
    private Integer uId;

    @Column(name = "SkillId")
    private Integer sId;

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
