package pack1;

public class Stringfunctios {

	public  void combained(String s) {
		String x[] = s.split(" ");
		/*
		 * for(int i=0;i<s.length();i++) { String z= x[i]; System.out.println(z);
		 * //System.out.println(x[i]);
		 * 
		 * }
		 */
		for(String splittin : x) { 
			System.out.println(splittin);
					
		}
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringfunctios sf = new Stringfunctios();
		sf.combained("welcome to java");
		sf.combained("java is a programming language");
		sf.combained("Java support selenium");

	}

}
