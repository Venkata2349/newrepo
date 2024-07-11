package JavaPackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Countofduplicate {

	public static void main(String[] args) {
		String str = "Siva prasad";
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
			for(Character ch : set) {
				System.out.println(ch);
			}
		}
			
	}

}
