package com.jetdevs.practical.groupC.controller;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.groupC.service.DeadlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeadlockController {

    @Autowired
    DeadlockService deadlockService;

    @RequestMapping(value = "/deadlock", method = RequestMethod.POST)
    public AppResponse deadlockDemo(){
        return new AppResponse<>(deadlockService.deadlockDemo());
    }
}
