package pack1;

import java.util.ArrayList;

public class Arrayli {

	public Arrayli(ArrayList<Integer> al) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(23);
		a2.add(40);
		a2.add(45);
		a2.add(1, 45);
		a2.set(1, 12);
		a2.remove(1);
		a2.add(45);
		
		System.out.println(a2);
		
	}

}
