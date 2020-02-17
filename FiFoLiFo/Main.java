package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(11);    
        integerList.add(22);
        integerList.add(33);
        integerList.add(44);
        integerList.add(55);
        integerList.push(1);    //Fifo push()
        integerList.pop();      //FIFO pop()

        printList(integerList); //FIFO print()
        System.out.println("===================");

        ArrayList<Integer> array = new ArrayList<>();
        array.add(11);
        array.add(22);
        array.add(33);
        array.add(44);                          //Lifo push

        array.remove(array.size()-1);   //LIFO pop()

        printArray(array.toArray());    //LIFO print()

    }
    public static void printList(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

    public static void printArray(Object[] array){
        int counter = array.length-1;
        while(counter>=0){
            System.out.println(array[counter]);
            counter--;
        }
    }



}
