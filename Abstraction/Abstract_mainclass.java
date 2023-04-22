package Abstraction;

abstract class AbstractClass{    
    public AbstractClass() {        // constructor    
        System.out.println("You can create constructor in abstract class");    
    }    
    abstract int add(int a, int b); // abstract method    
    int sub(int a, int b){      // non-abstract method    
        return a-b;    
    }    
    static int multiply(int a, int b){  // static method    
        return a*b;    
    }    
}    
public class Abstract_mainclass extends AbstractClass{    
    public int add(int a, int b){        // implementing abstract method    
        return a+b;    
    }    
    public static void main(String[] args) {    
    	Abstract_mainclass a = new Abstract_mainclass();    
//        int result1 = a.add(20, 10);    // calling abstract method    
//        int result2 = a.sub(20, 10);    // calling non-abstract method    
//        int result3 = AbstractClass.multiply(20, 10); // calling static method    
//        System.out.println("Addition: "+result1);    
//        System.out.println("Substraction: "+result2);    
//        System.out.println("Multiplication: "+result3);    
    }    
}  

//package Abstraction;
//
//import java.util.Scanner;
//
//public class Abstract_mainclass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		Bank bank=new Bank();
//	
//		boolean loop=true;
//		
//		while(loop) {
//			System.out.println("Choose your bank");
//			System.out.println("1.SBI\n2.IND\n3.CANERA\n4.ICIC\n5.EXIT");
//			int option=sc.nextInt();
//		switch(option){
//			case 1:{	
//				bank.SBI();
//				
//		break;
//			}
//			case 2:{
//				bank.IND();
//				break;
//			}
//			case 3:{
//				bank.Canera();
//		break;
//			}
//			case 4:{
//				bank.ICIC();
//		break;
//			}
//			case 5:
//			{
//				System.out.println("End of the prgrame");
//				loop=false;
//				break;
//		}
//
//	}
// }
//
//}
//
//}
//
// class a1{
//	 a1(){
//		 System.out.println("Hi i'm same file different class");
//	 }
//	
//}