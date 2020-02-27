#include <string>
#include <iostream>
#include "Node.cpp"

long search(Node start, Node end) {
	long best = INT_MAX;
	for (int i = 0; i < start.leftLinkSize(); i++)
	{
		Node next = start.getEdge(i).getLeftLink();
		if (next == end) {
			return start.getEdge(i).getValue();
		}
		if (next.leftLinkSize() == 0) {
			return 99999;
		}
		long newValue = start.getEdge(i).getValue() + search(next, end);
		if (newValue < best) {
			best = newValue;
		}
		return best;
	}
}

int main() {
	Node piano("piano");

	Node baseGuitar("base guitar");
	baseGuitar.addEdge(20, piano);

	Node drums("drums");
	drums.addEdge(10, piano);

	Node rareVivyl("rare vinyl");
	rareVivyl.addEdge(15, baseGuitar);
	rareVivyl.addEdge(20, drums);

	Node poster("poster");
	poster.addEdge(35, drums);
	poster.addEdge(30, baseGuitar);

	Node book("book");
	book.addEdge(0, poster);
	book.addEdge(5, rareVivyl);

	std::cout << "Best price from " << book.getValue() << " to " << piano.getValue() << " is " << search(book, piano) << std::endl;

}

