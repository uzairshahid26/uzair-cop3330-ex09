/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = checkNumber(scanner.nextLine());
        System.out.print("What is the width of the room in feet? ");
        int width = checkNumber(scanner.nextLine());
        int area = length * width;
        int leftOver = area % 350;
        int fullGallons = area / 350;
        if(leftOver>0) {
            fullGallons++;
        }
        System.out.println("You will need to buy " + fullGallons + (fullGallons>1 ? " Gallons of paint" : " Gallon") + " to cover " +
                area + " square feet.");
    }

    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

    private static int checkNumber(String inputStr)
    {
        Scanner scanner = new Scanner(System.in);

        String inputToCheck = inputStr;
        int input = 0;
        boolean completed = false;
        while(!completed) {
            if (isNum(inputToCheck)) {
                input = Integer.parseInt(inputToCheck);
                completed = true;
            }
            else {
                System.out.println("Error! Please insert digits only:");
                inputToCheck = scanner.nextLine();
            }
        }
        return input;





    }
}
