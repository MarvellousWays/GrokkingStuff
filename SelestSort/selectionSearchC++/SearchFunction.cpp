#include "SearchFunction.h"

SearchFunction::SearchFunction(){
}

 vector<int> SearchFunction::selestionSort(vector<int> arr){
    vector<int> newArr;
    for(int i = 0; i<sizeof(arr);i++){
        int smallest = findSmallest(arr);
        newArr.push_back(arr.at(smallest));
        arr.pop_back();
    }
    return newArr;
}

int SearchFunction::findSmallest(vector<int> arr){
    int smallest = arr[0];
    int smallest_index = 0;
    for(int i = 1; i<sizeof(arr);i++){
        if(arr[i] < smallest){
            smallest = arr[i];
            smallest_index = i;
        }
    }
    return smallest_index;
}

SearchFunction::~SearchFunction(){
}