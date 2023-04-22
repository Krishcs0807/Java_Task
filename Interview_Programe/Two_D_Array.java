package Interview_Programe;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,5,6},{7,1,8},{6,5,3}};
		   int c[][]= {{4,5,6},{7,1,8},{6,5,3}};
		   
		   int b[][] =new int [3][3];
		   
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<3;j++) {
				   b[i][j]=a[i][j]+c[i][j];
			   }
		   }
		   
		   for(int[] aa:b) {
			   for(int bb:aa) {
				   System.out.print(bb+" ");
			   }
			   System.out.println();
		   }
		   
		   
		   int a1[][]= {{1,9,6},{8,4,3},{3,7,1}};
		   int c1[][]= {{2,4,7},{3,8,9},{11,2,0}};
		   
		   
           int b1[][] =new int [3][3];
		   
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<3;j++) {
				   b1[i][j]=(a1[i][0]*c1[0][j])+(a1[i][1]*c1[1][j])+(a1[i][2]*c1[2][j]);
			   }
		   }
		   
		   for(int[] aa:b1) {
			   for(int bb:aa) {
				   System.out.print(bb+" ");
			   }
			   System.out.println();
		   }
	}

}
