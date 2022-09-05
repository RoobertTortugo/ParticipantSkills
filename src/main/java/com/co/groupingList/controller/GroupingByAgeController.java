package com.co.groupingList.controller;

import com.co.groupingList.model.ParticipantsEntity;
import com.co.groupingList.interfaces.GroupingByAge;
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
public class GroupingByAgeController{

    @Autowired
    private GroupingByAge groupingByAge;

    @GetMapping("/groupingAge")
    public ResponseEntity<Map<String, List<ParticipantsEntity>>> groupingByAge() {
        return new ResponseEntity<>(groupingByAge.groupingByAge(), HttpStatus.OK);
    }
}
