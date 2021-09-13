package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.println( "Enter the principal: " );
        int principal = input.nextInt();//Input
        //Taking the rate as a percentage and then dividing by 100 to use in the interest formula
        System.out.println("Enter the rate of interest: ");
        double rateOfInterest = input.nextDouble();//Input
        rateOfInterest = rateOfInterest/100;//
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();//Input
        //Calculating the interest using the formula P1(1 +rt)
        double interest = principal*(1 + rateOfInterest*years);
        interest = Math.ceil(interest);
        System.out.println("After " + years + " years at " + rateOfInterest*100 + "%, the investment will be worth $" + interest);//Output
    }
}
