package com.jetdevs.practical.groupB.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsService {

    public List<String>getGrades(List<Integer>marks){

        List<String>response=new ArrayList<>();

        marks.forEach(mark -> {
            if (mark>=90){
                response.add("A");
            } else if (mark < 60){
                response.add("C");
            } else {
                response.add("B");
            }
        });

        return response;
    }

}
