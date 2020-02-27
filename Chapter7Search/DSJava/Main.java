package com.company;

public class Main {

    public static void main(String[] args) {
	Node piano = new Node("piano");

	Node baseGuitar = new Node("base guitar");
	baseGuitar.addEdge(20,piano);

	Node drums = new Node("drums");
	drums.addEdge(10,piano);

	Node rareVinyl = new Node("rare vinyl");
	rareVinyl.addEdge(15,baseGuitar);
	rareVinyl.addEdge(20,drums);

	Node poster = new Node("poster");
	poster.addEdge(35,drums);
	poster.addEdge(30, baseGuitar);

	Node book = new Node("book");
	book.addEdge(0,poster);
	book.addEdge(5,rareVinyl);

        System.out.println("best price from "+book.getValue()+" to "+piano.getValue()+" is "+search(book,piano));
    }

    static long search(Node start ,Node end){
        long best =Long.MAX_VALUE;
        for (int i = 0; i < start.leftLinkSize(); i++) {
            Node next = start.getEdge(i).getLeftLink();
            if(next==end){
                return start.getEdge(i).getValue();
            }
            if(next.leftLinkSize()==0){
                return 99999;
            }
            long newValue = start.getEdge(i).getValue() + search(next,end);
            if(newValue<best){
                best = newValue;
            }
        }
        return best;
    }
}
