package simple_projrams;

import java.util.HashSet;
import java.util.Set;

public class removeDup {
public static void main(String[] args) {
	String st = "sukumarreddy";
	char[]  ltrs = st.toCharArray();
	Set<Character> set = new HashSet<>();
	for(char c : ltrs) {
	if(! set.add(c)) {
		System.out.println(c);
	}
	}
}
}
