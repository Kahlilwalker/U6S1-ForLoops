package com.codedifferently.labs.partC;

public class AlgoChallenge {
     /* Problem 1
    The parameter dcHero is true if it is an DC Hero,
    and the parameter avengerHero is true if the hero is an Avenger.
    Avengers will assemble if it is not a DC Hero, or they're an Avenger, or there is at least an Avenger on the team.
    Return true if the avengers are ready to assemble.
    Example:
    avengersAssemble(false, false) --> true
    avengersAssemble(false, true) --> true
    avengersAssemble(true, false) --> false
    avengersAssemble(true, true) --> true
     */

    public static String avengersAssemble(boolean dcHero, boolean avengerHero) {

        String response = "";

        if (dcHero == true && avengerHero == true) {

            response += "true";

        }

        if (dcHero == false && avengerHero == true) {

            response += "true";

        }

        if (dcHero == false && avengerHero == false) {

            response += "true";

        }

        if (dcHero == true && avengerHero == true) {

            response += "false";

        }

        return response;
    }


    /* Problem 2
    You and your friends are out walking on the boardwalk at Atlantic City
    and decided to go to Casino for the fun of it. One person won
    ___ amount of money. You're trying to find out if the amount was between 90-100 or 190-200.
    Return true if the amount of money is within 10 of 100 or 200.
    Tip: Math.abs(num) computes the absolute value of a number.
    nearValue(93) --> true
    nearValue(90) --> true
    nearValue(89) --> false
     */

    public static Boolean nearValue(int n) {

        return null;
    }


}