package com.xworkz.ipl.application;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int systemNumber = random.nextInt(10);
        System.out.println("welcome to number guessing name");
        System.out.println("enter the number of your choice between 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        if(systemNumber == userNumber)
        {
            System.out.println("number is matching:!!");
            System.out.println("system number is:"+systemNumber);
            System.out.println("user numberis:"+userNumber);
        }
        else {
            System.out.println("you guess the wrong number");
            System.out.println("system number is:"+systemNumber);
            System.out.println("user number is:"+userNumber);
        }
    }
}
