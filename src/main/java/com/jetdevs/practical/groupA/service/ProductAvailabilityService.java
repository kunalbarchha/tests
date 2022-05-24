package com.jetdevs.practical.groupA.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.TimeZone;

@Service
public class ProductAvailabilityService {
    public String isProductAvailable(String timeZone){
        LocalTime localNow = LocalTime.now(TimeZone.getTimeZone(timeZone.replace("\"","")).toZoneId());
        if(localNow.isBefore(LocalTime.of(9,00)) || localNow.isAfter(LocalTime.of(18,00))){
            return "Service unavailable";
        }else{
            return "Service is available";
        }
    }
}
