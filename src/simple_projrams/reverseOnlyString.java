package simple_projrams;

public class reverseOnlyString {
	public static void main(String[] args) {
		String s = "sukumar reddy from hyd";
		String st[] = s.split(" ");
		System.out.println(st.length);
		String rev="";
		for(int i=st.length-1; i>=0; i--) {
			 rev = rev+" "+st[i];
		}
		System.out.println(rev);
		
		String s2[] = {"s", "p", "v"};
		System.out.println(String.join("", s2));
	}

}
