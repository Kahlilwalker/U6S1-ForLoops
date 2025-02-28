package com.codedifferently.labs.partB.ex01;

public class CountByTens {
    public static String countingByTens() {
        String response = "";

        for(int j = 10; j<=100; j=j+10){

            response +=j +" ";
        }

        return response;
    }

    public static void main(String[] args) {
        String counting = countingByTens();
        System.out.print(counting);
    }
}
