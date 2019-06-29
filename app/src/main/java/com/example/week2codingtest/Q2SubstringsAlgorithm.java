package com.example.week2codingtest;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2SubstringsAlgorithm {

    public static void main(String[] args) {
        String aString = "frog";
        char[] letters = aString.toCharArray();
        String results = "";
        List<String> aList = new ArrayList<>();
        char temp = ' ';
        boolean done = false;

        System.out.println(aString);
        for(int i = 0; i < letters.length; i++){
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String inputString = scanner.nextLine();

        for(int i = 0; i < letters.length; i++){
            results = "";
            for(int j = i+1; j < letters.length; j++) {
                if(letters[j] > letters[i] && !done){
                    results += letters[i];
                }
            }
            aList.add(results);
        }

        for(String mString : aList){
            System.out.print(mString);
        }
    }
}
