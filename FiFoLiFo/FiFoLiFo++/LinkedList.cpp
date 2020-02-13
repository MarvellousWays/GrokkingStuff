#include "LinkedList.h"

LinkedList::LinkedList()
{
	head = NULL;
	tail = NULL;
}

void LinkedList::createNode(int value)  //same as insert in the end of list
{
	node *temp = new node;
	temp->data = value;
	temp->next = NULL;
	if (head == NULL) {
		head = temp;
		tail = temp;
		temp = NULL;
	}
	else {
		tail->next = temp;
		tail = temp;
	}
}

void LinkedList::display()
{
	node *selection = new node;
	selection = head;
	int i = 0;
	while (selection != NULL) {
	
		std::cout << i <<". element is "<< selection->data << std::endl;
		i++;
		selection = selection->next;
	}
}

void LinkedList::insertStart(int value)
{
	node *temp = new node;
	temp->data = value;
	temp->next = head;
	head = temp;
}

void LinkedList::insertPos(int pos, int value)
{
	node *previous = new node;
	node *current = new node;
	node *temp = new node;
	current = head;
	for (int i = 1; i < pos; i++)
	{
		previous = current;
		current = current->next;
	}
	temp->data = value;
	previous->next = temp;
	temp->next = current;
}

void LinkedList::deleteFirst()
{
	node *temp = new node;
	temp = head;
	head = head->next;
	delete temp;
}

void LinkedList::deleteLast()
{
	node *current = new node;
	node *previous = new node;
	current = head;
	while (current->next != NULL)
	{
		previous = current;
		current = current->next;
	}
	tail = previous;
	previous->next = NULL;
	delete current;
}

void LinkedList::deletePos(int pos)
{
	node *current = new node;
	node *previous = new node;
	current = head;
	for (int i = 1; i < pos; i++)
	{
		previous = current;
		current = current->next;
	}
	previous->next = current->next;
}

LinkedList::~LinkedList()
{

}
