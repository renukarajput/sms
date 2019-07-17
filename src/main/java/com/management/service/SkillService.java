package com.management.service;

import com.management.entity.Skill;
import com.management.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.Objects;

@Service
public class SkillService {

    @Autowired
    SkillRepository skillRepository;

    public Skill add(Skill skill) {

        try {
            if (skill != null)
               return this.skillRepository.save(skill);
            else
                throw new SQLDataException();
        } catch (SQLDataException e) {
            System.out.println("**** Duplicate record being inserted **** "+ e);
        }
        return null;
    }

    public Skill findByName(String name) {
        return skillRepository.findByName(name);
    }
}
