import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Patrick Brookshire
 */

public class Solution05{

    public static void main(String[] agrs){

        int x;
        int y;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        x = input.nextInt();

        System.out.println("What is the second number?");
        y = input.nextInt();

        int answer;

        answer = x + y;
        System.out.println(x + " + " + y + " = " + answer);

        answer = x - y;
        System.out.println(x + " - " + y + " = " + answer);

        answer = x * y;
        System.out.println(x + " * " + y + " = " + answer);

        answer = x / y;
        System.out.println(x + " / " + y + " = " + answer);
    }


}