package Dynamic_Binding;

public class Child2 extends Child {
	
	public void child2() {
		System.out.println("Hi i'm Child2 class");
		child1();
	}
	public void eat() {
		System.out.println("Child2 eat");
	}

}
