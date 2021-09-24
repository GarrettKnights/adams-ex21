/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise21;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        int usernum;
        String StringMonth;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Please enter the number of the month: ");
        //Scans input to amount
        usernum = ScanWord.nextInt();

        switch (usernum) {
            case 1:  StringMonth = "January";
                break;
            case 2:  StringMonth = "February";
                break;
            case 3:  StringMonth = "March";
                break;
            case 4:  StringMonth = "April";
                break;
            case 5:  StringMonth = "May";
                break;
            case 6:  StringMonth = "June";
                break;
            case 7:  StringMonth = "July";
                break;
            case 8:  StringMonth = "August";
                break;
            case 9:  StringMonth = "September";
                break;
            case 10: StringMonth = "October";
                break;
            case 11: StringMonth = "November";
                break;
            case 12: StringMonth = "December";
                break;
            default: StringMonth = "Error: please enter a valid month number";
                break;
        }

        System.out.println("The name of the month is " + StringMonth);
    }
}
