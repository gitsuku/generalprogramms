package simple_projrams;

public class dupChar {
	public static void main(String[] args) {
		String st = "sukumarreddy";
		char[]  ltrs = st.toCharArray();
		for(int i=0; i<st.length(); i++) {
			for(int j=i+1; j<st.length();j++) {
				if(ltrs[i]==ltrs[j]) {
				System.out.println("dup character is "+ltrs[j]);
				break;
				}
			}
		}
	}

}
