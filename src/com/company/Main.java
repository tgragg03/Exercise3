/*
Tanner Gragg
CSCI 1660
1/28/2020
 */
package com.company;
import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        double getTemp = getTemp();
        while(getTemp > -460){
            double celcius = toCelcius(getTemp);
            displayTemp(celcius);
            getTemp = getTemp();
        }
        System.out.println("Program is ending!");
    }
    static double getTemp(){
        System.out.println("Please enter a temperature in Farenheit ");
        double tempF = input.nextInt();
        return tempF;
    }
    static double toCelcius(double getTemp){
        double celsius = ((getTemp - 32)*5)/9;
        return celsius;

    }
    static void displayTemp(double a){
        System.out.println("Your temperature in Celcius is " + a + "degrees");
    }
}
