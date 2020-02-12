#include "Hashtable.h"
#include<iostream>

using namespace std;

int main() {
	Hashtable table(15); 
	table.insert(0, 1);
	table.insert(1, 11);
	table.insert(2, 111);
	table.insert(3, 1111);
	table.printEntries();

	cout << "Entry with value '1111' has key " << table.searchByValue(1111) << endl;
	cout << "Entry with key '2' has value "<<table.searchByKey(2)<<endl;
	
	system("pause");
}