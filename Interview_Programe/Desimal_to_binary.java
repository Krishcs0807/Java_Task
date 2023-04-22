 package Interview_Programe;

public class Desimal_to_binary {

	public static void main(String[] args) {
		int desimal=200;
		String binary="";
		while(desimal>0) {
			binary=binary+(desimal%2);
			desimal=desimal/2;
		}
		System.out.print(binary); 

	}

}
