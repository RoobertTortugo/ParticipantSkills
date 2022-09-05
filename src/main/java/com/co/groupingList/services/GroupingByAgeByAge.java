package com.co.groupingList.services;

import com.co.groupingList.interfaces.GroupingByAge;
import com.co.groupingList.model.ParticipantsEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GroupingByAgeByAge implements GroupingByAge {

    private List<ParticipantsEntity> participantsEntityList;

    public Map<String, List<ParticipantsEntity>> groupingByAge(){
        return new CreateParticipants().participants().stream()
                .collect(Collectors.groupingBy(ParticipantsEntity::getAge));
    }

}
