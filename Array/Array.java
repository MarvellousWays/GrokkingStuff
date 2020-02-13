package com.company;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[15];

        for (int i = 0; i <array.length ; i++) {
            array[i]=i*i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Position "+i+" in array has value "+ array[i]);
        }
    }
}
