package JavaPackage;

public class loops extends Encapsulationexample {

	public static void main(String[] args) {
//		//Need to print 1 to 10
//		for(int i=0;i<=10;i++) {
//		System.out.println(i);
//	}
		
		String str ="Siva Kumar";
		System.out.println(str.length());
		
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			
//			System.out.println(ch);
//		}
//		System.out.println(str);
//		String spacestr = str.replace(" ", "");
//		System.out.println(spacestr);
//		
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb.reverse().toString());
		
		for(int j=str.length()-1;j>=0;j--) {
			char ch1 = str.charAt(j);
			System.out.println(ch1);
		}
		
		loops lop = new loops();
		lop.setStundentName("chenna");
		String str1 =lop.getStundentName();
		System.out.println(str1);
	}

}
