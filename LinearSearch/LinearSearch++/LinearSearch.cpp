#include "LinearSearch.h"
#include<iostream>



LinearSearch::LinearSearch()
{
}

int LinearSearch::searchPos(int *array, int value,int size)
{
	for (int i = 0; i <size; i++)
	{
		if (array[i] == value)
			return i;
	}
	return -1;
}

bool LinearSearch::hasValue(int *array, int value, int size)
{
	if(searchPos(array, value,size) >= 0)
		return true;
	return false;
}


LinearSearch::~LinearSearch()
{
}
