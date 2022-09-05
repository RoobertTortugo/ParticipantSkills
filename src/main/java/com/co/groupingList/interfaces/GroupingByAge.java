package com.co.groupingList.interfaces;

import com.co.groupingList.model.ParticipantsEntity;

import java.util.List;
import java.util.Map;

public interface GroupingByAge {
    Map<String, List<ParticipantsEntity>> groupingByAge();
}
