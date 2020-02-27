#pragma once
#include "Node.cpp"
class Edge {
private:
	long value;
	Node leftLink;
public:
	Edge(long value,Node leftLink) {
		this->leftLink = leftLink;
		this->value = value;
	}

	long getValue() {
		return this->value;
	}

	Node getLeftLink() {
		return leftLink;
	}

	bool operator==(const Edge& e) const {
		return (value == e.value) && (leftLink == e.leftLink);
	}

	~Edge() {
		
	}
};