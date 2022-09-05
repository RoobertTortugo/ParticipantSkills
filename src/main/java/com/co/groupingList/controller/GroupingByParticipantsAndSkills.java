package com.co.groupingList.controller;

import com.co.groupingList.interfaces.GroupingParticipantsAndSkills;
import com.co.groupingList.model.ParticipantsEntity;
import com.co.groupingList.model.ParticipantsWithSkillsEntity;
import com.co.groupingList.model.SkillsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class GroupingByParticipantsAndSkills {

    @Autowired
    private GroupingParticipantsAndSkills groupingParticipantsAndSkills;

    @GetMapping("/groupingByParticipantsAndSkills")
    public ResponseEntity<List<ParticipantsEntity>> groupingByParticipantsAndSkills(){
        return new ResponseEntity<>(groupingParticipantsAndSkills.groupingParticipantsAndSkills(), HttpStatus.OK);
    }
}
