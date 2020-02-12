#include "Hashtable.h"
#include<iostream>
#include<cstdlib>
#include<string>
#include<cstdio>



Hashtable::Hashtable( int tableSize)
{
	if (tableSize > 0)
		ts = tableSize;
	else
		ts = DEFAULT_SIZE;
	t = new HashTableEntry *[ts];
	for (int i = 0; i < ts; i++)
	{
		t[i] = NULL;
	}
}

void Hashtable::printEntries()
{
	for (int i = 0; i < ts; i++)
	{
		if (t[i] == NULL)
			continue;
		std::cout << t[i]->toString()<< std::endl;
	}
}

void Hashtable::insert(int key, int value)
{
	if (t[key] != NULL)
		delete t[key];
	t[key] = new HashTableEntry(key, value);
}

int Hashtable::searchByKey(int key)
{	

	if (t[key] == NULL)
		return -1;
	else
		return t[key]->value;
	
}

int Hashtable::searchByValue(int value)
{
	for (int i = 0; i < ts; i++) {
		if (t[i]->value == value)
			return t[i]->key;
	}
	return - 1;
}

void Hashtable::remove(int key)
{
	if (t[key] == NULL) {
		std::cout << "There is no such entry" << std::endl;
		return;
	}
	delete t[key];

}


Hashtable::~Hashtable()
{
	for (int i = 0; i < ts; i++)
	{
		if (t[i] != NULL)
			delete t[i];
	}
	delete[] t;
}
