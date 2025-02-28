package com.codedifferently.labs.partA.ex01;

public class Countdown {
    public static String countDownLoop() {
        String response = "";
        for (int i = 5; i >= 0; i--) {
            response += i + " ";
        }
        return response;
    }

    public static String countUpLoop() {
<<<<<<< HEAD
        String response = "";
=======
String response = "";
>>>>>>> 0c585fb1541dda8aae1bdf1307d190d9e723879b
        for(int i = 10; i >= 0; i--) {
            response += i + " ";
        }
        return response;
    }

    public static String evenNumbers(){
        String response = "";
        for(int i = 50; i >= 0; i -= 5) {
            response += i + " ";
        }
        return response;
    }
    public static void main(String[] args) {

        System.out.println("Countdown to Launch: ");

        String outputFromDown = countDownLoop();
        System.out.println(outputFromDown);

        System.out.println("Blast Off!");

        System.out.println("CountUp to Launch One: ");

        String outputCountUp = countUpLoop();
        System.out.println(outputCountUp);

        System.out.println("Blast Off!");

        String outputCountEven = evenNumbers();
        System.out.println(outputCountEven);

        System.out.println("Blast Off!");
    }
}