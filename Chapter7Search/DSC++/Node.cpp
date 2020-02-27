#pragma once
#include "Edge.cpp"
#include <string>
#include <array>
class Node {
private:

	std::string value;
	std::array<Edge, 5> *leftLink;

	int indexOf(Edge edge) {
		for (int i = 0; i < leftLink->size; i++)
		{
			if (leftLink->at(i) == edge) {
				return i;
			}
		}
		return -1;
	}

public:

	Node() {
		value = "Node";
	}

	Node(std::string value) {
		this->value = value;
	}

	bool addEdge(long value, Node next) {
		Edge edge(value, next);
		if (this->indexOf(edge) >= 0) {
			return false;
		}
		else {
			leftLink->assign(edge);
			return true;
		}
	}

	int leftLinkSize() {
		return leftLink->size();
	}

	Edge getEdge(int index) {
		if (index > leftLink->size() - 1) {
			return;
		}
		return leftLink->at(index);
	}

	std::string getValue() {
		return value;
	}

	//thx "stack overflow"
	bool operator==(const Node& n) const {
		return (value == n.value) && (leftLink == n.leftLink);
	}

	~Node() {
		delete leftLink;
	}
};