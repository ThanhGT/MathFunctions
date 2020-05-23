/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methods;

import java.util.Scanner;

/**
 *
 * @author THANH
 */
public class Methods {

    /**
     * Shows the main menu when called
     *
     * @return an int corresponding to the users selection
     */
    public static int mainMenu() {

        int select;
        Scanner input = new Scanner(System.in);
        int charLength = 15;

        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nMENU");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nWhat Math functions are you looking to use today?");
        System.out.println("1. Trigonometric Functions");
        System.out.println("2. Exponent Functions");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
        select = input.nextInt();
        return select;
    }

    /**
     * method that runs the appropriate menu
     */
    public static void run() {

        int select = mainMenu();

        switch (select) {
            case 1:
                trigFunctions();
                break;
            case 2:
                exponentFunctions();
                break;
            default:
                System.out.println("Selection is not valid. Program will terminate");
        }
    }

    /**
     * method that runs the menu for exponent functions
     *
     * @return an int corresponding to the users selection
     */
    public static int exponentMenu() {

        int select;

        Scanner input = new Scanner(System.in);

        int charLength = 25;
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nEXPONENT FUNCTIONS");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nWhat exponent function would you like to apply?");
        System.out.println("1. Exponent");
        System.out.println("2. Logarithm");
        System.out.println("3. Logarithm Base 10");
        System.out.println("4. Power");
        System.out.println("5. Square Root");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
        select = input.nextInt();

        return select;
    }

    /**
     * method that runs the trigonometric menu
     * @return int corresponding to the users input
     */
    public static int trigMenu() {

        int select;

        Scanner input = new Scanner(System.in);

        int charLength = 15;
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nTRIGONOMETRIC FUNCTIONS");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nWhat trigonometric function would you like to apply?");
        System.out.println("1. Sin");
        System.out.println("2. Cos");
        System.out.println("3. Tan");
        System.out.println("4. aSin");
        System.out.println("5. aCos");
        System.out.println("6. aTan");
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
        select = input.nextInt();

        return select;
    }

    /**
     * method that runs the menu of rounding options
     * @param result the answer from math functions
     * @return rounded number calculated from calling a different method
     */
    public static double roundingMenu(double result) {
        
        int select;

        Scanner input = new Scanner(System.in);

        int charLength = 15;
        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\nROUNDING NUMBERS");

        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }

        //the actual menu...
        System.out.println("\nHow would like you like your answer?");
        System.out.println("1. Round Up");
        System.out.println("2. Round Down");
        System.out.println("3. Nearest Integer");
        System.out.println("4. Integer Conversion (32-bit");
        System.out.println("5. Long Conversion (64-bit)");

        // for loop to create a seperator for the menu
        for (int i = 0; i < charLength; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
        select = input.nextInt();
        double roundedNum = roundingMethods(result, select);

        return roundedNum;
    }

    /**
     * method that rounds results to the desired user outcome
     * @param result the answer from previous math functions
     * @param select the selection the user made in the previous menu
     * @return 
     */
    public static double roundingMethods(double result, int select) {
        double retval = result;
        // switch statement
        switch (select) {
            case 1:
                retval = Math.ceil(result);   // round up to the nearest value
                break;
            case 2:
                retval = Math.floor(result); // round down to the nearest value
                break;
            case 3:
                retval = Math.rint(result); // round to the nearest integer
                break;
            case 4:
                retval = (int) result;  // convert result to an int
                break;
            case 5:
                retval = (long) result; // convert result to a long
                break;
            default:
                System.out.print("No selection exists. Please try again.");
        }
        return retval;
    }

    /**
     * a method that holds switch statement
     */
    public static void trigFunctions() {

        // while isRunning is true keep running the switch statement
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double num = input.nextInt();

        boolean isRunning = true;
        while (isRunning) {
            // select holds the value that mainMenu returns
            int select = trigMenu();

            // switch statement
            switch (select) {
                case 1:
                    double sinResult = Math.sin(num);   // store answer for exponent algorithm
                    double roundedSinResult = roundingMenu(sinResult);
                    System.out.printf("The sin of %f is %1.2f. ", num, roundedSinResult);
                    isRunning = displayChoiceMenu();
                    break;
                case 2:
                    double cosResult = Math.cos(num); // store result of log x into logResult
                    double roundedCosResult = roundingMenu(cosResult);
                    System.out.printf("The cos of %f is %1.2f.", num, roundedCosResult);   // print result to user
                    isRunning = displayChoiceMenu();
                    break;
                case 3:
                    double tanResult = Math.tan(num); // stores result of log base 10 of input into a10
                    double roundedTanResult = roundingMenu(tanResult);
                    System.out.printf("The tan of %f is %1.2f ", num, roundedTanResult); // print out output to the user
                    isRunning = displayChoiceMenu();
                    break;
                case 4:
                    double aSinResult = Math.asin(num);
                    double roundedASinResult = roundingMenu(aSinResult);
                    System.out.printf("The aSin of %f is %1.2f ", num, roundedASinResult);
                    break;
                case 5:
                    double aCosResult = Math.acos(num);
                    double roundedACosResult = roundingMenu(aCosResult);
                    System.out.printf("The acos of %f is %1.2f ", num, aCosResult);
                    break;
                case 6:
                    double aTanResult = Math.atan(num);
                    double roundedATanResult = roundingMenu(aTanResult);
                    System.out.printf("The atan of %f is %1.2f ", num, aTanResult);
                    break;
                default:
                    System.out.print("No selection exists. Please choose a valid selection.");
            }
        }
    }

    public static void exponentFunctions() {
        // while isRunning is true keep running the switch statement
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double num = input.nextInt();

        boolean isRunning = true;
        while (isRunning) {
            // select holds the value that mainMenu returns
            int select = exponentMenu();

            // switch statement
            switch (select) {
                case 1:
                    double expResult = Math.exp(num);   // store answer for exponent algorithm
                    double roundedExpResult = roundingMenu(expResult);
                    System.out.printf("%1.0f raised to the power of e results in %1.4f. ", num, roundedExpResult);
                    isRunning = displayChoiceMenu();
                    break;
                case 2:
                    double logResult = Math.log(num); // store result of log x into logResult
                    double roundedLogResult = roundingMenu(logResult);
                    System.out.printf("The natural logarithm of %1.0f is %1.5f.", num, roundedLogResult);   // print result to user
                    isRunning = displayChoiceMenu();
                    break;
                case 3:
                    double baseLogResult = Math.log10(num); // stores result of log base 10 of input into a10
                    double roundedBaseLogResult = roundingMenu(baseLogResult);
                    System.out.printf("The 10 base logarithm of %1.0f is %f ", num, roundedBaseLogResult); // print out output to the user
                    isRunning = displayChoiceMenu();
                    break;
                case 4:
                    System.out.print("Enter an exponent: ");
                    int n = input.nextInt();

                    int lastDigit = lastDigit(n);

                    //handle suffixes
                    String suffix;
                    if (lastDigit == 1) {
                        suffix = "st";
                    } else if (lastDigit == 2) {
                        suffix = "nd";
                    } else if (lastDigit == 3) {
                        suffix = "rd";
                    } else {
                        suffix = "th";
                    }

                    double powResult = Math.pow(num, n);
                    double roundedPowResult = roundingMenu(powResult);
                    System.out.printf("%1.0f to the %d%s power results in %1.0f: ", num, n, suffix, roundedPowResult);
                    isRunning = displayChoiceMenu();
                    break;

                default:
                    System.out.print("No selection exists. Please choose a valid selection.");
            }
        }
    }

    /**
     * method that determines the last digit value of the exponent the user entered
     * @param n the exponent value the user entered 
     * @return the last digit of the power
     */
    
    public static int lastDigit(int n) {
        int lastDigit = n % 10;
        return lastDigit;
    }

    /**
     * method that asks user if they would like to rerun the menu again
     * @return a boolean value depending on users choice
     */
    
    public static boolean displayChoiceMenu() {
        boolean retval = false;
        System.out.println("\nWould you like to go back to the menu?");
        System.out.println(" Y = Yes N = No");
        Scanner in = new Scanner(System.in);
        String sc = in.nextLine();
        sc = sc.toUpperCase();  // convert user input to upper case
        if (sc.equals("Y")) {

            System.out.println("What menu would you like to go back to?");
            System.out.println("1. Main Menu");
            System.out.println("2. Previous Menu");

            int menuChoice = in.nextInt();

            switch (menuChoice) {
                case 1:
                    run();
                    break;
                case 2:
                    retval = true;
                    break;
            }

        } else if (sc.equals("N")) {
            retval = false;
        }
        return retval;
    }

    /**
     * main method; initializes program
     * @param args  
     */
    public static void main(String[] args) {

        run();
    }
}
