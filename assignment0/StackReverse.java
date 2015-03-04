public class StackReverse {

    // When this function is called, we know that the
    // length of the array is at least 1(We would have
    // returned with error if the array length was 0).
    // Therefore, we only check for cases where the 
    // length of the array is at least 1. 
    // The number of stacks needed is 1 if the length of 
    // array is between 1 to 50 and 2 if the length of 
    // the array is between 51 and 100 and so on. 
    public static int getNumOfStacksNeeded(int length) {
	return (int)((length-1)/ArrayStack.length() + 1);
    }

    public static void ArrayReverse(Integer[] inputArray) {

	if(inputArray.length == 0) {
	    System.out.println("The array provided has zero elements. ");
	    return;
	}
	//First, find out the number of Stacks we need,
	// to reverse the array (Max size of one stack 
	// is 50. So we might need to multiple stacks
	// to reverse the array.)
	int numOfStacks = getNumOfStacksNeeded(inputArray.length);

	// Create the stacks
	ArrayStack[] setOfStacks = new ArrayStack[numOfStacks];
	
	// Store the values in the array in the stacks,
	// one by one filling up all the stacks
	for(int i = 0; i < numOfStacks; i++) {
	    setOfStacks[i] = new ArrayStack();
	    for(int j = 0; j < ArrayStack.length(); j++) {
		int index = i*ArrayStack.length() + j; 
		setOfStacks[i].push(inputArray[index]);
		if(index == inputArray.length-1) {
		    break;
		}
	    }
	}
	
	//Get the values back from the stacks into the array,
	// by popping the values from the stacks. 
	int k = 0;
	for(int i = numOfStacks-1; i >= 0; i--) {
	    while(!setOfStacks[i].isEmpty()) {
		inputArray[k] = (Integer)(setOfStacks[i].pop());
		k++;
	    }
	}
    }

}
