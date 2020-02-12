#pragma once
#include <string>
class HashTableEntry {
public:
	int key;
	int value;
	HashTableEntry(int key, int value) {
		this->key = key;
		this->value = value;
	}
	std::string toString() {
		std::string str;
		str += std::to_string(key);
		str += ": ";
		str += std::to_string(value);
		return str;

	}
};

class Hashtable
{
	HashTableEntry **t;	//error if single *
	int ts;
	const int DEFAULT_SIZE = 10;
public:
	Hashtable(int tableSize);
	void printEntries();
	void insert(int key, int value);
	int searchByKey(int key);
	int searchByValue(int value);
	void remove(int key);
	~Hashtable();
};

