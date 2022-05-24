package com.jetdevs.practical.groupA.controller;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.groupA.service.BracketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BracketsController {

    @Autowired
    BracketsService bracketsService;

    @RequestMapping(value = "/brackets", method = RequestMethod.POST)
    public AppResponse correctBrackets(@RequestBody String inputString){
        return new AppResponse<>(bracketsService.correctBrackets(inputString));
    }
}
