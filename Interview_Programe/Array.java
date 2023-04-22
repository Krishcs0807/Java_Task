package Interview_Programe;

import java.util.Arrays;

public class Array {
	public static void main(String []args) {
		int[] number= {12,45,100,233,21,765,45,75,344,54};
		
		Arrays.sort(number);
		for(int i=number.length-1;i>0;i++) {
			System.out.println("-------Array maximum number value sort method-------\n"+number[i]);
			break;
		}
		
		int[] number1= {1,2,3,4,5,6,7,8,9,10};
		int max=0;
		for(int a:number1) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println("-------Array maximum number value-------\n"+max);
		int min=0;
		for(int a:number1) {
			if(min==0) {
				min=a;
			}
			else if(min>a) {
				min=a;
			}
		}
		
		System.out.println("-------Array minumum number value-------\n"+min);
		
		int M=0;
		int m=0;
		
		for(int a:number1) {
			if(m==0) {
				m=a;
			}
			else if(m>a) {
				m=a;
			}
			
			if(M<a) {
				M=a;
			}
		}
		
		
		System.out.println("-------Array maximum and minumum number value-------\n"+M+"\n"+m);
		
		int max1=0;
		int max2=0;
		for(int a:number1) {
			if(max2<a) {
				max2=a;
			}
			if(max1<a) {
				max2=max1;
				max1=a;
			}
		}
		System.out.println("-------Array maximum two value-------");
		System.out.println(max2+"  "+max1);
		
		
		System.out.println("-------0 to number remove balance numberprinted-------");
		int[] numbers= {12,45,100,0,21,0,45,75,0,54};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				System.out.println(numbers[i]);
			}
		}
		
	}

}
