#pragma once
#include <vector>
using namespace std;
class SearchFunction{
    public: 
        SearchFunction();
        vector<int> selestionSort(vector<int> arr);
        ~SearchFunction();
    private:
        int findSmallest(vector<int> arr);

};