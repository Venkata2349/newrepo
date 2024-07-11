package Newtask;

public class Methodnames {
	public void nonstatic_method() {
	int a=20;
	int b=30;
	int total=a+b;
	System.out.println(total);
	}
	public static void static_method() {
		int c=40;
		int d=50;
		int sub= d-c;
		System.out.println(sub);
	}
public static void main(String[] args) {
	static_method();
	Methodnames m1= new Methodnames();
	m1.nonstatic_method();
}
}
