package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> quickSort(ArrayList<Integer> array){
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(array.size()<2)
            return array;
        else{
            int pivot = array.get(0);
            for(int i = 1; i<array.size();i++){
                if(array.get(i)<=pivot){
                    less.add(array.get(i));
                }
                else{
                    greater.add(array.get(i));
                }
            }
            less=quickSort(less);
            greater=quickSort(greater);
            result.addAll(less);
            result.add(pivot);
            result.addAll(greater);
            return result;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = getIntegers(5);
        System.out.println(Arrays.toString(quickSort(array).toArray()));
    }

    private static ArrayList<Integer> getIntegers(int numbers){
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter "+numbers+" Integers\n");
        for (int i = 0 ; i < numbers ; i++){
            array.add(scanner.nextInt());
        }
        return array;
    }

}
