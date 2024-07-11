package JavaPackage;

public class CallingObject {
	
	public void palindrom(String str1) {
		
		StringBuffer sb1 = new StringBuffer(str1);
		String str2 = sb1.reverse().toString();
		if(str1.equals(str2)) {
			System.out.println(str1+" is a palnidrome");
		} else {
			System.out.println(str1+ " is not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		CallingObject cal = new CallingObject();
		cal.palindrom("Kumar");
		cal.palindrom("OXO");
		cal.palindrom("123321");
		cal.palindrom("siva");
		cal.palindrom("12321");

	}

}
