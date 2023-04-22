package Interface;

public interface Interfcesample  {
	private void save1() {
		System.out.println("i'm private methode");
	}
	default void save3() {
		System.out.println("i'm default methode");
		save1();
	}
	
	 void save2();
	static void save4() {
		System.out.println("i'm interface static method");
	}
	
}
