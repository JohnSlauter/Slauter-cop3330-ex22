package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        int[] arr = initialize_arr();

        int biggest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(biggest < arr[i]){

                biggest = arr[i];

            }

        }

        System.out.print("The largest number is " + biggest + ".");

    }

    private static int[] initialize_arr(){

        Scanner s = new Scanner(System.in);

        int[] arr = new int[3];

        System.out.print("Enter the first number: ");

        arr[0] = s.nextInt();

        s.nextLine();

        System.out.print("Enter the second number: ");

        arr[1] = s.nextInt();

        s.nextLine();

        System.out.print("Enter the third number: ");

        arr[2] = s.nextInt();

        s.close();

        return arr;

    }

}
