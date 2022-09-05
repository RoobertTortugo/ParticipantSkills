package com.co.groupingList.services;

import com.co.groupingList.model.SkillsEntity;

import java.util.ArrayList;
import java.util.List;

public class CreateSkills {

    private SkillsEntity skillsEntity;

    public List<SkillsEntity> skills(){
        final List<SkillsEntity> skillsEntityList = new ArrayList<>();
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Junior 1").technologist("Java").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Junior 1").technologist("Java, POO").build());
        skillsEntityList.add
                (SkillsEntity.builder().skillLevel("Junior 1").technologist("Java, POO, SQL").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Advance 1").technologist("Junior 3, Docker").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Advance 2").technologist("Junior 3, Docker, Spring boot").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Advance 3").technologist("Junior 3, Docker, Spring boot, lombok").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Senior 1").technologist("Advance 3, Lambda").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Senior 2").technologist("Advance 3, Lambda, Reactive").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Senior 3").technologist("Advance 3, Lambda, Reactive, DevOps").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Master 1").technologist("Senior 3, two languages").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Master 2").technologist("Senior 3, two languages, Multi-paradigm").build());
        skillsEntityList.add(
                SkillsEntity.builder().skillLevel("Master 3").technologist("Senior 3, is a god").build());
        return skillsEntityList;
    }

}
