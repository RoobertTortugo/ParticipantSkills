package com.co.groupingList.services;

import com.co.groupingList.model.ParticipantsEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class GroupingByAgeSortName implements com.co.groupingList.interfaces.GroupingByAgeSortName {
    @Override
    public Map<String, List<ParticipantsEntity>> groupingByAgeSortName() {
        return new CreateParticipants().participants().stream().collect(
                Collectors.groupingBy(ParticipantsEntity::getAge,
                Collectors.mapping(Function.identity(),
                        Collectors.collectingAndThen(Collectors.toList(),
                                x -> x.stream().sorted(Comparator.comparing(ParticipantsEntity::getName))
                                        .collect(Collectors.toList())))));
    }
}
