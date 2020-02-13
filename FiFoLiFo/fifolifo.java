package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(11);    //FirstIn
        integerList.add(22);
        integerList.add(33);
        integerList.add(44);
        integerList.add(55);
        integerList.pop();      //FirstOut - deletes '11'

        printList(integerList);
        System.out.println("===================");

        ArrayList<Integer> array = new ArrayList<>();
        array.add(11);
        array.add(22);
        array.add(33);
        array.add(44);                          //LastIn

        array.remove(array.size()-1);   //FirstOut - deletes '44'

        printList(array);

    }
    public static void printList(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }



}
