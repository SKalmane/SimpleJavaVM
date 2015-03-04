public class StackTest {
    public static void main(String[] args) {
	// ArrayStack stack = new ArrayStack();
	// stack.push(10);
	// stack.push(20);
	// stack.push(30);
	// stack.push(40);
	// System.out.println(stack.pop());
	// System.out.println(stack.pop());
	// System.out.println(stack.pop());
	// System.out.println(stack.pop());

	int arraySize = 0;
	Integer[] intArray = new Integer[arraySize];
	for(int i = 0; i < arraySize; i++) {
	    intArray[i] = new Integer(i+1);
	}
	StackReverse.ArrayReverse(intArray); 

	for(int i = 0; i < arraySize; i++) {
	    System.out.println(intArray[i]);
	}
    }
    
}
