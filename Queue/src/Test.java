
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue queue = new Queue();
     // insert queue value
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.printQueuedata();
        
        // Print Size 
        System.out.println("Size: " + queue.Size());       
        //Print Dequeue Node
        System.out.printf("Dequeue Node: " + queue.dequeue());
     // Delete element of queue
 //       queue.dequeue();
       
        queue.printQueuedata();
        System.out.print("Size: " + queue.Size());
	}

}
