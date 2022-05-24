package com.jetdevs.practical.groupB.service;

import com.jetdevs.practical.commons.AppResponse;
import com.jetdevs.practical.commons.CustomException;
import com.jetdevs.practical.models.TrainRequestDTO;
import com.jetdevs.practical.models.TrainResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TrainService {

    public TrainResponseDTO getPlatformDetails(TrainRequestDTO request) throws Exception {

        int arr[] = new int[request.getArrival().length];
        int dep[] = new int[request.getDeparture().length];

        if(arr.length!=dep.length){
            throw new CustomException(400,"Arrival and departure of some trains is missing");
        }

        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(request.getArrival()[i].replace(":",""));
            dep[i] = Integer.parseInt(request.getDeparture()[i].replace(":",""));
        }
        TrainResponseDTO response=new TrainResponseDTO();

        response.setPlatforms(findPlatform(arr, dep, arr.length));

        return response;

    }

    public static int findPlatform(int arr[], int dep[], int n){

        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        for (i = 0; i < n; i++) {
            plat_needed = 1;

            for (j = i + 1; j < n; j++) {
                // check for overlap
                if (Math.max(arr[i], arr[j])
                        <= Math.min(dep[i], dep[j]))
                    plat_needed++;
            }

            result = Math.max(result, plat_needed);
        }

        return result;
    }



}
