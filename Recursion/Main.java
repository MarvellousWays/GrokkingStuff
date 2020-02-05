package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int recursion(){
        int integer=0;
        System.out.println("Enter integer: ");
        if(scanner.hasNextInt()){
             integer = scanner.nextInt();
             return integer+recursion();
        }
        else return integer;
    }

    public static void main(String[] args) {
	int recursionSum =recursion();
        System.out.println("Value is "+recursionSum);
    }
}
