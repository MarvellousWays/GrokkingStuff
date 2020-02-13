#include "LinkedList.h"

void separate() {
	std::cout << "=====================" << std::endl;
}
int main() {
	LinkedList linkedList;

	for(int i = 1 ; i<=10;i++)
		linkedList.createNode(i + 3 * i);		//LastIn '40'

	linkedList.insertStart(223164);				//FirstIn '22316455'
	linkedList.insertPos(5, 5555555);

	linkedList.display();
	separate();

	linkedList.deleteFirst();			//FIFO	deletes '22316455'
	linkedList.deleteLast();			//LIFO	deletes '40'
	
	linkedList.display();
	separate();

	system("pause");
	return 0;
}