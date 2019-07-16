package com.management.service;

import com.management.entity.Skill;
import com.management.exception.SkillException;
import com.management.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SkillService {

    @Autowired
    SkillRepository skillRepository;

    /*public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }*/

    //1,java
    public void add(Skill skill) {
        if (skill != null)
            this.skillRepository.save(skill);

        Skill bySkillId = findBySkillId(skill.getId());
        System.out.println("******* "+ bySkillId.getId()+ "***** "+ bySkillId.getName());
    }

    public Skill findBySkillId(Integer id) {
        return skillRepository.findById(id).orElseThrow(() ->
                new SkillException(HttpStatus.NOT_FOUND, "Resource Not Found"));
    }
}
