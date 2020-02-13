#pragma once
#include <array>
class LinearSearch
{
public:
	LinearSearch();
	int searchPos(int *array,int value,int size);
	bool hasValue(int *array, int value,int size);
	~LinearSearch();
};

