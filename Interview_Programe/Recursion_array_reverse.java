package Interview_Programe;

public class Recursion_array_reverse {
	
	public void arryreverse(String []arr,int lenth) {
		
		if(lenth>=0) {
			System.out.println(arr[lenth]);
			lenth--;
			arryreverse(arr,lenth);
		}
	
	}
	public static void main(String []args) {
		
		String []name= {"gopal","mani","gowtham","kavi","Arun"};
		int L=name.length-1;
		
		Recursion_array_reverse obj=new Recursion_array_reverse();
		obj.arryreverse(name,L);
		
//		int a[]= {5,65,45,23,65,56,33};
//		for(int i=0;i<a.length;i++){
//			if(a[i]==56) {
//				System.out.println(a[i]+"  index"+i);
//			}
//		}
	}

}
