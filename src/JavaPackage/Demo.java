package JavaPackage;








public class Demo {

	public static void main(String[] args) {
		String s1 = "Kumar";
		String s2 = "Kumar";
		String s3 = new String("Kumar");
		String s4 = new String("kuMAr");
		
		
		System.out.println(s1==s2); // true
		
		System.out.println(s1.equals(s4));  // false
		
		System.out.println(s1.equals(s3));  // True
		 
		System.out.println(s1.equalsIgnoreCase(s4)); //True
		
		System.out.println(s3==s2); // false
		
		System.out.println(s3.equals(s4));  // false
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		//palnidrom
		//s1 = "oxo";
		//rs3 = "oxo";
		
		String rs1 = "chennakesava";
		StringBuffer rs2 = new StringBuffer(rs1);
		
		
		if(rs1.equals(rs2.reverse().toString())) {
			System.out.println("s1 is palindrom");
		}else {
			System.out.println("s1 is not a palindrom");
		}
		
		
		
		
		
	}
}
