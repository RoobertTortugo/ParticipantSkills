package com.co.groupingList.services;

import com.co.groupingList.model.ParticipantsEntity;
import com.co.groupingList.model.SkillsEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupingParticipantsAndSkills implements com.co.groupingList.interfaces.GroupingParticipantsAndSkills {

    @Override
    public List<ParticipantsEntity> groupingParticipantsAndSkills() {

        List<ParticipantsEntity> participants = new CreateParticipants().participants();

        List<SkillsEntity> skills = new CreateSkills().skills();

        return participants.stream().map(participant -> participant.toBuilder()
                .skillsEntityList(skills.stream().filter(
                        s1 -> s1.getSkillLevel().equals(participant.getSkill())).collect(Collectors.toList()))
                .build()).collect(Collectors.toList());

//        return participants.stream().map(participant -> ParticipantsWithSkillsEntity.builder()
//                .participantsEntity(participant)
//                .skillsEntityList(skills.stream().filter(
//                        s1 -> s1.getSkillLevel().equals(participant.getSkill())).collect(Collectors.toList()))
//                .build()).collect(Collectors.toList());
    }
}
