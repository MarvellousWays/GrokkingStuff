package com.company;

public class LinearSearch {
    public static int searchPos(int value,int[] array){
        for (int i = 0; i <array.length; i++) {
            if(array[i]==value)
                return i;
        }
        return -1;
    }

    public static boolean hasValue(int value,int[] array) {
        return searchPos(value,array) >= 0;
    }

}
