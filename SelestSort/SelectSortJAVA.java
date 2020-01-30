package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array ={0,9,2,8,1,7,3,6,4,5};
         array= sort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static int[] sort(int[] array){
        int[] arraySorted = new int[array.length];
        int pos=0;
        for(int i = array.length-1;i>=0;i--){
            int biggestNum=Integer.MIN_VALUE;
            for(int a = 0;a<array.length;a++){
                if(array[a]>biggestNum){
                    biggestNum=array[a];
                    pos = a;
                }
            }
            array[pos] = Integer.MIN_VALUE;
            arraySorted[array.length-1 - i] = biggestNum;
        }
        return arraySorted;
    }
}
