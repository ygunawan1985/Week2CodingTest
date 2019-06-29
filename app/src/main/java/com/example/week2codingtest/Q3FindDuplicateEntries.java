package com.example.week2codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q3FindDuplicateEntries {
    public static void main(String[] args) {
        String[][] stringArray = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "a", "b"}};
        List<String> newList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        HashSet<String> stringSet = new HashSet<>();

        //Print the array with duplicates
        for(int i = 0; i < stringArray.length; i++){
            for(int j = 0; j < stringArray[i].length; j++){
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < stringArray.length; i++){
            for(int j = 0; j < stringArray[i].length; j++){
                String aString = stringArray[i][j];
                if(!stringSet.add(aString)){
                    newList.add(aString);
                }
            }
        }

        //Find positions of resultList in the 2D array
        for(int i = 0; i < stringArray.length; i++){
            for(int j = 0; j < stringArray[i].length; j++){
                for(String tempString : newList){
                    if(stringArray[i][j].equalsIgnoreCase(tempString)){
                        resultList.add(i + ", " + j);
                    }
                }
            }
        }

        System.out.println("The duplicate entries are in the following position(s):");
        for(String result : resultList) {
            System.out.println(result);
        }
    }
}
