#include <iostream>
#include "SearchFunction.h"





int main() {


	int myList[] = {1,3,5,7,9};

	SearchFunction bs;

	std::cout << bs.binary_search(myList, 9) << std::endl;;
	system("pause");
	return 0;

}
