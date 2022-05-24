package com.jetdevs.practical.groupB.controller;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.groupB.service.TrainService;
import com.jetdevs.practical.models.TrainRequestDTO;
import com.jetdevs.practical.models.TrainResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatformController {

    @Autowired
    TrainService trainService;


    @RequestMapping(value = "/trains", method = RequestMethod.POST)
    public AppResponse<TrainResponseDTO>getPlatforms(@RequestBody TrainRequestDTO trainRequest){
        return new AppResponse<>(trainService.getPlatformDetails(trainRequest));
    }
}
