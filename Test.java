
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack stack = new Stack();
        // insert Stack value
        stack.push(2);
        stack.push(7);
        stack.push(5);
        // print Stack elements        
        stack.printStack();
 
        System.out.println("Size : " + stack.size());
 
        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", stack.peek());
 
        // Delete top element of Stack
        stack.pop();
        stack.pop();
 
        // print Stack elements

        stack.printStack();
        System.out.println("Size : " + stack.size());
 
        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", stack.peek());
	}
}
