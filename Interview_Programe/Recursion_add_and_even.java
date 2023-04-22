package Interview_Programe;

public class Recursion_add_and_even {
	
	public void addeven(int i) {
		
	int [] a= {10,2,3,4,5,1,7,13,21,19};
    int l=a.length;
	 if(i<l) {
		 
		if(a[i]%2==0) {
			System.out.println("Even--->"+a[i]);
		}
		if(a[i]%2!=0) { 
			System.out.println("Add--->"+a[i]);
		}
		i++;
		addeven(i);
	 }
	 
	}

	public static void main(String[] args) {
		Recursion_add_and_even obj=new Recursion_add_and_even();
		obj.addeven(0);

	}

}
