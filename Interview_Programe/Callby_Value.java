 package Interview_Programe;

import java.util.Scanner;

public class Callby_Value {
	
	String name;

	public static void main(String[] args) {
		
		String a="Hello";
		System.out.println(a.hashCode());
		System.out.println(a);
		String b=a;
		System.out.println(b.hashCode());
		System.out.println(b);
	    a="Hi";
		System.out.println(a.hashCode());
		System.out.println(a);
		b=a;
		System.out.println(b.hashCode());
		System.out.println(b);
		
		
		
//		
//		Callby_Value obj1=new Callby_Value();
//		obj1.name="Hi";
//		callby_Value(obj1);
		
		
	}

	static void callby_Value(Callby_Value obj) {
//		String a=obj.name="Hello";
//		System.out.println(a.hashCode());
//		System.out.println(a);
//		String b=obj.name=a;
//		System.out.println(b.hashCode());
//		System.out.println(b);
		
	}

}
 