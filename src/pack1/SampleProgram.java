package pack1;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java");
		/*
		 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Siva\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver =
		 * new ChromeDriver();
		 */
		System.out.println("Gonna to print Verticle");
		String s1="welcome Java";
		for(int i=0;i<s1.length();i++) {
			char c1= s1.charAt(i);
			System.out.println(c1);
		}
		System.out.println("Gonna to print reverse");
		for(int j=s1.length()-1;j>=0;j--) {
			char c2=s1.charAt(j);
			System.out.println(c2);
		}
		/*
		 * System.out.println("Split the string"); String a[]=s1.split(" "); for(int
		 * k=0;k<s1.length();k++) { System.out.println(a[k]); }
		 */
		System.out.println("gonna to replce character");
		System.out.println(s1.replace('e', 'x'));
		System.out.println("Gonna to use substring");
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.charAt(6));
		
		int what_need_change=6;
		char what_i_need= 'x';
		StringBuilder s2 = new StringBuilder(s1);
		s2.setCharAt(what_need_change, what_i_need);
		System.out.println(s2);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		
		String s3 ="chenna kesava";
		String s4 = "Chenna kesava";
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("passed");
		}else
		System.out.println("fail");
		
		
		
	}

}
