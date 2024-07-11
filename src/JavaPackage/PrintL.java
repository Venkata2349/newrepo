package JavaPackage;

import java.util.Scanner;

public class PrintL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
	    //creating object 
	    Scanner s = new Scanner(System.in);
	    
	    // entering the number of row
	    System.out.println("Enter rows : ");
	    row = s.nextInt();
	    
	    //outer for loop 
	    for (int i = 0; i < row ; i++) 
	    {
	        // this line prints first column stars
	        System.out.print("* ");
	        // inner for loop
	        for (int j = 0; j <= row; j++)
	        {
	            // printing stars
	            if (i == row - 1)
	                System.out.print("* ");
	            // printing space
	            else
	                System.out.print(" ");
	        }
	        System.out.print ("\n");
	    }
	    {
	    	
	    }
	

	}

}
