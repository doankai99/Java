// A structure to represent a deque
public class Queue {
	public Node head;
    public Node tail;
    public int size;
    
    public Queue()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;    }
    // Function to insert an element
    // at the front end
    public void enqueue(int data)
    {
        // Create a new node
    	 Node node = new Node(data, this.tail);
    	 System.out.println("Inserting " + data);
         // If true then new element cannot be added
         // and it is an 'Overflow' condition
         if (node == null)
           System.out.print("OverFlow\n");
         else {
           // If deque is empty
           if (tail == null)
             head = tail = node;
    
           // Inserts node at the rear end
           else {
             node.prev = tail;
             tail.next = node;
            tail = node;
           }
    
           size++;
         }
    }
    // Function to check whether deque
    // is empty or not
    public boolean isEmpty() { 
    	return (head == null); 
    	}
    // Function to get a front element of the queue
    public int peek()
    {
        if (this.isEmpty() == true)
        {
            System.out.println("Empty Queue:");
            // When queue is empty
            return -1;
        }
        else
        {
            return this.head.data;
        }
    }
    public int Size()
    {
        return this.size;
    }
    // Function to remove a front node of a queue
    public int dequeue()
    {
        if (this.isEmpty() == true)
        {
            // When queue is empty
            return -1;
        }
        else
        {
            int data = this.peek();
            if (this.head == this.tail)
            {
                // When queue contains only one node
                this.tail = null;
                this.head = null;
            }
            else
            {
                this.head = this.head.next;
                this.head.prev = null;
            }
            // Change size queue
            this.size--;
            // Delete node value
            return data;
        }
    }

    // Function to print elements of queue
    public void printQueuedata()
    {
        Node node = this.head;
        System.out.println("Queue Element:");
        while (node != null)
        {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

}
