package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {1,3,5,7,9};
        int item=0;
        System.out.println("Enter number you are looking for: ");
        item = scanner.nextInt();
        System.out.println(SearchFunction.binarySearch(list,item)+1);
        scanner.close();
    }
}
