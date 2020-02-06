#include <iostream>
#include <vector>

using namespace std;

vector<int> quickSort(vector<int> array) {
	vector<int> less;
	vector<int> greater;
	vector<int> result;
	if (array.size() < 2) {
		return array;
	}
	else {
		int pivot = array.at(0);
		for (int i = 1; i < array.size(); i++) {
			if (array.at(i) <= pivot) {
				less.push_back(array.at(i));
			}
			else {
				greater.push_back(array.at(i));
			}
		}
		less = quickSort(less);
		greater = quickSort(greater);
		result.insert(result.end(), less.begin(), less.end());
		result.push_back(pivot);
		result.insert(result.end(), greater.begin(), greater.end());
		result.shrink_to_fit();
		return result;
	}
}

int main() {

	vector<int> arr = { 10,5,2,3,0 };
	arr = quickSort(arr);
	for (int i = 0; i < arr.size(); i++) {
		std::cout << arr.at(i) << " ";
	}
	std::cout << std::endl;
	system("pause");
}