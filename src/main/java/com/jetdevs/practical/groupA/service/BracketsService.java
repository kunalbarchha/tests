package com.jetdevs.practical.groupA.service;

import org.springframework.stereotype.Service;

@Service
public class BracketsService {
    public String correctBrackets(String inputStr){
        String validatedText="";
        int countOpenBraces=0;
        for(int i=0; i<inputStr.length(); i++){
            if(inputStr.charAt(i)=='('){
                validatedText+=inputStr.charAt(i);
                countOpenBraces++;
            }else if(inputStr.charAt(i)==')'){
                if(countOpenBraces>0){
                    validatedText+=inputStr.charAt(i);
                    countOpenBraces--;
                }
            }else{
                validatedText+=inputStr.charAt(i);
            }
        }
        return validatedText.replace("\"","");
    }
}
