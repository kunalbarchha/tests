package com.jetdevs.practical.groupB.controller;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.groupB.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public AppResponse<List<String>>getGrades(@RequestBody List<Integer>marks){
        return new AppResponse<>(studentsService.getGrades(marks));
    }
}
