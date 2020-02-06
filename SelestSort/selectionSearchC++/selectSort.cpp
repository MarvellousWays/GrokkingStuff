#include <iostream>
#include "SearchFunction.h"

int main(){
    SearchFunction ss;
    std::vector<int> arr = {5,3,6,2,10};
    arr = ss.selestionSort(arr);
    for(int i = 0; i< sizeof(arr);i++){
        std::cout<<arr.at(i)<<" ";
    }
}
