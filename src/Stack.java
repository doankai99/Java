import static java.lang.System.exit;
public class Stack {
	// create global top reference variable global
 	private Node top;
    private int size;
 	// Constructor
	public Stack()
	    {
	        this.top = null;
	        this.size = 0;
	    }
	    // Utility function to add an element x in the stack
	    public void push(int x) // insert at the beginning
	    {
	        // create new node temp and allocate memory
	        Node temp = new Node();
	        System.out.println("Inserting " + x);
	        // check if stack (heap) is full. Then inserting an
	        //  element would lead to stack overflow
	        if (temp == null) {
	            System.out.print("\nHeap Overflow");
	            return;
	        }
	 
	        // initialize data into temp data field
	        temp.data = x;
	 
	        // put top reference into temp link
	        temp.next = top;
	 
	        // update top reference
	        top = temp;
	        // increase stack's size by 1
	        this.size += 1;
	    }
	 
	    // Utility function to check if the stack is empty or not
	    public boolean isEmpty()
	    {
	        return top == null;
	    }
	 
	    // Utility function to return top element in a stack
	    public int peek()
	    {	    	
//	         check for empty stack
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	    }
	 
	    // Utility function to pop top element from the stack
	    public void pop() // remove at the beginning
	    {
	        // check for stack underflow
	        if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
	        }
	        // decrease stack's size by 1
	        this.size -= 1;
	        // update the top pointer to point to the next node
	        top = (top).next;
	    }
	    // Function to return the size of the stack
	    public int size() {
	        return this.size;
	    }
	     
	    public void printStack() {
	    	Node node = this.top;
	    	System.out.println("Stack Element: ");
	        while (node != null)
	        {
	            System.out.print(" " + node.data);
	            node = node.next;
	        }
	        System.out.println();
	    }
}
