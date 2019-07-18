package com.management.controller;

import com.management.entity.Skill;
import com.management.repository.SkillRepository;
import com.management.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/skills/")
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping("status")
    public String test() {
        return "up";
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Skill skill) {
        System.out.println("add method");
        Skill output = skillService.add(skill);
        System.out.println("Skill data - "+ output);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("{skill}")
    public ResponseEntity<?> getBySkill(@RequestParam String skill) {
        Skill byName = skillService.findByName(skill);
        System.out.println("Skill found - "+ byName.getSkillId()+ " - "+ byName.getName());
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public List<Skill> getAllSkills() {
      return skillService.findAll();
    }
}
