package com.example.week2codingtest;

public class Q1SortIntArray {

    public static void main(String[] args) {
        int[] anArray = {2,8,9,3,4,3,2,6,6,2,4,9,8};
        int temp = 0;

        //prints the unsorted array
        for(int number : anArray){
            System.out.print(number + " ");
        }

        System.out.println();

        for(int i = 0; i < anArray.length; i++){
            for(int j = i+1; j < anArray.length; j++) {
                if(anArray[i] > anArray[j]){
                    temp = anArray[i];
                    anArray[i] = anArray[j];
                    anArray[j] = temp;
                }
            }
        }

        //prints in ascending order
        for(int number : anArray){
            System.out.print(number + " ");
        }

    }
}
