package simple_projrams;

public class checkAlphabetic {
	public static void main(String[] args) {
	
	String name = "SuKuMaR";
	int count=0;
	char c[] = name.toCharArray();
	for(int i=0; i<c.length; i++) {
		if(Character.isAlphabetic(c[i])) {
			System.out.println(c[i]);
			count ++;
		}
	}
System.out.println(count);
	}
}
