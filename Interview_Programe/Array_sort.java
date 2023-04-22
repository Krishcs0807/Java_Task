package Interview_Programe;

public class Array_sort {

	public static void main(String[] args) {
	
		int []array= {4,3,7,9,5,7,8,3,7,4};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int b=array[i];
					array[i]=array[j];
					array[j]=b;
					
							
				}
			}
		}
		
		for(int arr:array) {
			System.out.println(arr);
		}

		
		int []array1= {4,3,7,9,5,7,8,3,7,4};
	
		
		for(int j=0;j<array1.length;j++) {
		
		for(int i=1;i<array1.length;i++) {
			
				if(array1[i]<array1[i-1]) {
					int b=array1[i];
					array1[i]=array1[i-1];
					array1[i-1]=b;
					
							
				}
		}
		}
		
		for(int arr:array1) {
			System.out.print(arr);
		}
		
		int []array2= {4,3,7,9,5,7,8,3,7,4};
		int temp=0;
		for(int i=0;i<array2.length;i++) {
			temp=array[i];
			for(int j=0;j<i;j++) {
				if(array2[i]<array2[j]) {
					rightshift(array2,j,i);
					array2[j]=temp;
				}
			}
		}
		
		for(int arr2:array2){
			System.out.println(arr2);
		}

		
	}

	private static void rightshift(int[] array2, int index_s, int index_l) {
		for(int i=index_s;i>index_l;i--) {
			array2[i]=array2[i-1];
		}
		
	}
	
}