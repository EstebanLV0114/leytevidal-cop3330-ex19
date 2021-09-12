package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main(String[] args)
    {
        double H, W, BMI;

        Scanner input = new Scanner(System.in);

        //Normal input, calculates BMI
        try
        {
            //Prompts the user for input
            System.out.print("What is your height? ");
            H = input.nextDouble();
            System.out.print("What is your weight? ");
            W = input.nextDouble();

            //BMI Calculation
            BMI = (W / (H * H)) * 703;

            System.out.printf("Your BMI is %.2f.\n", BMI);

            System.out.println(BMI > 25 ? "You are overweight. You should see your doctor." : BMI < 18.5 ? "You are underweight. You should see your doctor." : "You are within the ideal weight range.");
        }

        //If invalid input (ie Number)
        catch (Exception e)
        {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
