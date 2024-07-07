package com.example.Week1Homework.Week1Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker{
    @Autowired
    Syrup syrup;
    @Autowired
    Frosting frosting;

//    public CakeBaker(Syrup syrup, Frosting frosting){
//        this.syrup = syrup;
//        this.frosting = frosting;
//    }
    void bakeCake(){
        String frostingType = frosting.getFrostingType();;
        String syrupType = syrup.getSyrupType();
        System.out.println("frostingType : " + frostingType + " syrupType : " + syrupType);
    }

}
