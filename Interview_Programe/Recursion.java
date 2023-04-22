package Interview_Programe;

public class Recursion {
	int i=1;
	public void recursion(int a,int b) {
		if(a==0) {
			System.out.println("-------------fibinocis-----------");
		System.out.print(a+" ");
		}
		
		if(i<20) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
			recursion(a, b);
			}
		
		
		
	}

	public static void main(String[] args) {
		
		Recursion obj=new Recursion();
		obj.recursion(0, 1);

	}

}
