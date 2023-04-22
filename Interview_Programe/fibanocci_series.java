package Interview_Programe;

public class fibanocci_series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=20;i++) {
			//int c=a+b;
			System.out.print(a+b+" ");
			b=a+b;
			a=b-a;
			
		}
		
		System.out.println();
		
		int a1=0;
		int b1=1;
		System.out.print(a1+" ");
//		System.out.print(b1+" ");
		for(int i=1;i<=20;i++) {
			int c=a1+b1;
			System.out.print(c+" ");
			b1=a1;
			a1=c;
			
		}

	}

}
