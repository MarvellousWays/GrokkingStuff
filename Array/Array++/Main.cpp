#include <iostream>
#include "LinearSearch.h"

int main() {
	const int size = 15;
	int array[size];

	for (int i = 0; i < (sizeof array)/4; i++)
	{
		array[i] = i * i;
	}
	for (int i = 0; i < (sizeof array)/4; i++)
	{
		std::cout << array[i] << std::endl;
	}
	
	LinearSearch ls;
	if(ls.hasValue(array, 49,size))
		std::cout << "YES"<<std::endl;



	system("pause");
}