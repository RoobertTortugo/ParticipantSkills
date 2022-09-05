package com.co.groupingList.controller;

import com.co.groupingList.interfaces.GroupingByAgeSortName;
import com.co.groupingList.model.ParticipantsEntity;
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
public class GroupingByAgeSortNameController {

    @Autowired
    private GroupingByAgeSortName groupingByAgeSortName;

    @GetMapping("/groupingAgeAndSortName")
    public ResponseEntity<Map<String, List<ParticipantsEntity>>> aroupingByAgeSortNameController() {
        return new ResponseEntity<>(groupingByAgeSortName.groupingByAgeSortName(), HttpStatus.OK);
    }
}
