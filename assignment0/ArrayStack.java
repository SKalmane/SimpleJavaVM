public class ArrayStack {

    public ArrayStack() {
	top = -1;
	stackData = new Object[50];
    }
    
    public static final int length() {
	return 50; 
    }

    public Object pop()
	throws java.lang.ArrayIndexOutOfBoundsException {
	if(top == -1) {
	    throw new java.util.EmptyStackException();
	}
	Object data = stackData[top];
	top--;
	return data; 
    }

    public void push(Object givenObj)
	throws java.lang.ArrayIndexOutOfBoundsException {
	top++;
	stackData[top] = givenObj;
    }
    
    public boolean isEmpty() {
	if (top == -1) {
	    return true;
	}
	return false;
    }
    
    private Object[] stackData;
    private Integer top; 
};
