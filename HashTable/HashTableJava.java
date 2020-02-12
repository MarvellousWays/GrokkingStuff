package com.company;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>();
        Hashtable<Integer,String> table2 = new Hashtable<>();


        table.put("Hello",0);
        table.put("Worlds",1);
        System.out.println(table.toString());

        table.computeIfAbsent("Hell-o",k -> 2);
        table.putIfAbsent("Who rld",3);                 //same but constant
        table.computeIfAbsent("Nnnooo",UoU -> 4);
        System.out.println(table.toString());

        if(table.containsValue(0))
            System.out.println("Hello = 0" );
        if(table.containsKey("Worlds"))
            System.out.println("Welcome!");

        table2.put(0,"My");
        table2.put(1,"Name");
        table2.put(2,"Is");
        table2.put(3,"Nikita");
        table2.put(-1,"How this got here");     //Putting negative is valid
        table2.put(-2,"How to predict this");   //But outcome of Enum is unpredictable
        table2.put(-3,"I dont kow");            //

        displayValues(table2);      //Output proves that Enum e goes from biggest key value to smallest

        //table.entrySet()   Don't know how to handle sets
        System.out.println(table2.get(-3));     //Proves that negatives are valid
        System.out.println(table2.hashCode());
        System.out.println(table2.hashCode());

        table2.put(4,"New entry");
        System.out.println(table2.hashCode());
        table2.remove(-1);

        System.out.println(table2.toString());

        System.out.println(table2.keys());

        displayKeys(table2);

    }

    private static void displayValues(Hashtable<Integer,String> table){
        Enumeration<String> e = table.elements();  //like Iterator but for hashtable values

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
    private static void displayKeys(Hashtable<Integer,String> table){
        Enumeration<Integer> e = table.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
