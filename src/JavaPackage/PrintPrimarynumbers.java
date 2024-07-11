package JavaPackage;

import java.util.Scanner;

public class PrintPrimarynumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int n;
		int c=0;
		System.out.println("Ener a number");
		n=sc.nextInt();
		for(i=2;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==1) 
			System.out.println("not a primary number");
		
		else if(c==2) 
			System.out.println("primary number");
		else 
			System.out.println("not a primary number");
		
			
		

	}

}
