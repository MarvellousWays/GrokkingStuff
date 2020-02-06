#pragma once
#include <iostream>

class node {
public:
	int data;
	node *next;
};

class LinkedList {
private:
	node *head, *tail;

public:
	LinkedList();
	void createNode(int value);
	void display();
	void insertStart(int value);
	void insertPos(int pos, int value);
	void deleteFirst();
	void deleteLast();
	void deletePos(int pos);
	~LinkedList();
};