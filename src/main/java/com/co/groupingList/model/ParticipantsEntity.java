package com.co.groupingList.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ParticipantsEntity {
    private String name;
    private String age;
    private String skill;
    private List<SkillsEntity> skillsEntityList;
}
