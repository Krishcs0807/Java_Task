package Static;

public class Static {
	static String instute="Payilagam";
	static String batche="Batche-3";
	static String course="Full Stack";
	static String Java_trainer="Ganesh";
	static String Html_and_css_trainer="Muthu";
	static String start_time="8 AM";
	static String end_time="12 PM";
	
	String S_name;
	String qualifaction;
	String Phone;
	public void Batch3(String S_name,String qualifaction,String Phone) {
	    this.S_name=S_name;
	    this.qualifaction=qualifaction;
	    this.Phone=Phone;
		
	}
	

	@Override
	public String toString() {
		return  "instute                :"+instute+
				"\nbatche                 :"+batche+
				"\ncourse                 :"+course+
				"\nJava_trainer           :"+Java_trainer+
				"\nHtml_and_css_trainer   :"+Html_and_css_trainer+
				"\nstart_time             :"+start_time+
				"\nend_time               :"+end_time+
				"\nS_name                 :" + S_name +
				"\nqualifaction           :" + qualifaction +
				"\nPhone                  :" + Phone ;
	}
	
	
	
	public static void main(String[] args) {
		Static student1=new Static();
		student1.Batch3("Gopalakrishnan","M.sc","9791696978");
		String Std1=student1.toString();
		System.out.println(Std1);
		System.out.println();
		Static.batche="9";
		Static student2=new Static();
		student1.Batch3("Gowtham","MCA","9791696978");
		String Std2=student1.toString();
		System.out.println(Std2);
		student2.batche="19";
		System.out.println();
		Static student3=new Static();
		student1.Batch3("Gowtham","MCA","9791696978");
		String Std3=student1.toString();
		System.out.println(Std3);

            
	}
}
