package com.jetdevs.practical.groupA.controller;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.groupA.service.BracketsService;
import com.jetdevs.practical.groupA.service.ProductAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAvailabilityController {

    @Autowired
    ProductAvailabilityService productAvailabilityService;

    @RequestMapping(value = "/product-availability", method = RequestMethod.POST)
    public AppResponse productAvailability(@RequestBody String timeZone){
        return new AppResponse<>(productAvailabilityService.isProductAvailable(timeZone));
    }
}
