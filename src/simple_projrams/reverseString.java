package simple_projrams;

public class reverseString {
	
	public static String revereseStr(String name) {

		//char ch[] = name.toCharArray();
		String rev="";
		for(int i= name.length()-1; i>=0; i--) {
			rev= rev+name.charAt(i);
			//System.out.println(rev);
		}
		//System.out.println(rev);
		return rev;
	}

	

	public static void main(String[] args) {

		String reverse = revereseStr("sukumar");
		System.out.println(reverse);
	}
}
