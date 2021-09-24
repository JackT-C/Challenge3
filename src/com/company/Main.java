package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("what is your name? ");
        String employeeName = input.nextLine();
        System.out.println("your name is " + employeeName);

        System.out.println("how much do you make per hour? ");
        int baseWage = input.nextInt();

        System.out.println("how many hours have you worked this week? ");
        int hoursWorked = input.nextInt();
        if ((hoursWorked) < 45) {
            System.out.println("the hours you have worked this week are " + hoursWorked);
        }
        else {
            System.out.println("you many extra hours did you work for?");
            int overTimeWage = input.nextInt();
            int pay = (int) (overTimeWage * 1.5) * (hoursWorked)
        }
        int payTwo = baseWage * hoursWorked
        System.out.println("your total pay is " + payTwo);
   }
}
