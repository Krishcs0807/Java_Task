package Abstraction;

class Abstract_subclass extends Abstract_c {
	
	
	double rate;

	@Override
	 void intrest(double rate) {
        rate=rate%100;
		
		this.rate=rate;
	}
	void rate_colculate(int P,int T)  {
        
		double Interest = P*rate*T;
		System.out.println("Lone Amount="+P);
		System.out.println("intrest="+Interest+" "+T+"-year");
	}
	


}
