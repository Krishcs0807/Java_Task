package Interview_Programe;

import java.util.Arrays;

public class Array_stack {

	public static void main(String[] args) {
		
		
		Array_stack obj=new Array_stack();
		obj.push(5);
		obj.push(8);
		obj.push(3);
		obj.push(37);
		System.out.print(obj.toString());
		
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	
		System.out.print(obj.toString());

	}
	
	int[] arrays=new int[10];
	int n=-1;
	
	@Override
	public String toString() {
		return "Array_stack [arrays=" + Arrays.toString(arrays) + "]";
	}

	public void push(int value) {
		
	   if(n==10) {
		   System.out.println("Stack is full");
	   }
	   else {
		arrays[++n]=value;
	   }
	   
	}
	
   public int pop() {  
	    if(n>=0) {
	    	
	    	return arrays[n--];
	    }
	    else {
	    	 System.out.println("Stack is empty");
	    	return -1;
	    }
	
	}

}
