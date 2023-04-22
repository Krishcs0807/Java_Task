package Dynamic_Binding;

public class Child extends Parent {
	public void child1() {
		System.out.println("Hi i'm Child1 class");
		parent();
	}
	
	public void eat() {
		System.out.println("Child1 eat");
	}
}
