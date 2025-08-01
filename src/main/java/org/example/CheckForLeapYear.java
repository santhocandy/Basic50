package org.example;

public class CheckForLeapYear {
    public boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        CheckForLeapYear checkForLeapYear = new CheckForLeapYear();

        boolean input = checkForLeapYear.isLeapYear(2000);
        System.out.println(input);

        boolean input2 = checkForLeapYear.isLeapYear(2008);
        System.out.println(input2);

        boolean input3 = checkForLeapYear.isLeapYear(2007);
        System.out.println(input3);


        boolean input4 = checkForLeapYear.isLeapYear(2004);
        System.out.println(input4);

    }
}
