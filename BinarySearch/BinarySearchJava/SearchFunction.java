package com.company;
public class SearchFunction {
    SearchFunction(){

    }
    public static int binarySearch(int[] list,int item){
        int
                low =0,
                high = list.length,
                mid = 0,
                guess =0;

        while(low<=high){
            mid = (low + high) / 2;
            guess = list[mid];
            if (guess == item) return mid;
            if (guess > item) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
