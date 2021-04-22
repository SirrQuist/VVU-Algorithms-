import java.util.Stack;
public class StackADT {
	

	
		  
	    // Element push to top of the stack 
	    static void StackPush(Stack<Integer> stack) 
	    { 
	        for(int i = 0; i < 6; i++) 
	        { 
	            stack.push(i); 
	        } 
	    } 
	      
	    // Popping element from the top of the stack 
	    static void StackPop(Stack<Integer> stack) 
	    { 
	        System.out.println("The Pop Operation --- "); 
	  
	        for(int i = 0; i < 6; i++) 
	        { 
	            Integer y = (Integer) stack.pop(); 
	            System.out.println(y); 
	        }
	        
	    } 
	    
	    // Searching element in the stack 
	    static void StackSearch(Stack<Integer> stack, int element) 
	    { 
	        Integer pstn = (Integer) stack.search(element); 
	  
	        if(pstn == -1) 
	            System.out.println("\n" + element + " cannot be found in the stack.Search again..."); 
	        else
	            System.out.println("\n"+ element + " is found at position  " + pstn+"\n"); 
	    } 
	  
	    // Displaying element on the top of the stack 
	    static void StackPeek(Stack<Integer> stack) 
	    { 
	        Integer element = (Integer) stack.peek(); 
	        System.out.println("The element on top of stack is " + element); 
	    } 
	      
	   
	  
	  
	    public static void main (String[] args) 
	    { 
	        Stack<Integer> stack = new Stack<Integer>(); 
	  
	        StackPush(stack); 
	        StackPop(stack); 
	        StackPush(stack);
	        StackSearch(stack, 3); 
	        StackPeek(stack); 
	        StackSearch(stack, 6); 
	    } 
	   

	}


