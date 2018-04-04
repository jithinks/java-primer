package com.jks.startup.logic;

import java.util.ArrayList;
import java.util.List;

public class CanDivideByOnetoYourChoice {

    public static void main(String[] args) {

        int howMany=5;
        int top=1;
        int minBottom=1, maxBottom=10;
        int withAll=0;

        List<Integer> champions = new ArrayList<>();

        for(top=1;;top++){
           String temp="";
            for(int bottom=minBottom; bottom<=maxBottom; bottom++){
                if(top%bottom==0){
                    temp=temp+bottom+" ";
                    withAll++;
                }else{
                    withAll=0;
                    break;
                }
            }
            //System.out.println(top+" "+temp);

            if(withAll==maxBottom){
                champions.add(top);
                --howMany;
            }

            if(howMany==0)break;
        }

        System.out.println("\nChampion(s):"+champions);
    }
}
