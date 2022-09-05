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
public class ParticipantsWithSkillsEntity {
    private ParticipantsEntity participantsEntity;
    private List<SkillsEntity> skillsEntityList;
}
