package Interview_Programe;

public class Add_even {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int evensum=0;
		int addsum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println("even "+a[i]);
				evensum=evensum+a[i];
			}
			if(i%2!=0) {
				System.out.println("Add "+a[i]);
				addsum=addsum+a[i];
			}
		}
		System.out.println("Evensum="+evensum);
		System.out.println("Addsum="+addsum);

	}

}
