// Node of a doubly linked list
public class Node {
	int data; // value stored in the node
	Node next; // address of the next node
	Node prev;
	public Node(int data, Node prev)
    {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
	
}
