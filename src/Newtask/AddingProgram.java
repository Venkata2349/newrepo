package Newtask;

public class AddingProgram {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("adding a and b value is "+c);
	}
		
		public static void reverse(String str) {
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse());
			System.out.println(str);
			
			for(int i= str.length()-1; i>=0;i--) {
				char x = str.charAt(i);
				System.out.println(x);
				
			}
			
		}
		
	
	
	public static void main(String[] args) {
		AddingProgram a1 = new AddingProgram();
		a1.add(10,30);
		a1.add(100, -200);
		reverse("chennakesava");
		reverse("sivakumar");
	}

}
