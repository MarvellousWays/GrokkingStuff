#include "LinkedList.h"

void separate() {
	std::cout << "=====================" << std::endl;
}
int main() {
	LinkedList linkedList;
	for(int i = 1 ; i<=10;i++)
		linkedList.createNode(i + 3 * i);
	linkedList.display();
	separate();
	linkedList.insertStart(223164);
	linkedList.insertPos(5, 5555555);
	linkedList.display();
	separate();
	linkedList.deleteFirst();
	linkedList.deleteLast();
	linkedList.deletePos(7);
	linkedList.display();
	separate();
	system("pause");
	return 0;
}