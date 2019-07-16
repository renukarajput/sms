package com.management.controller;

import com.management.entity.Skill;
import com.management.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        skillService.add(skill);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> getBySkillId(@RequestParam Integer id) {
        skillService.findBySkillId(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
