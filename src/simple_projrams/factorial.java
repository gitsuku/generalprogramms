package simple_projrams;

public class factorial {
	public static void main(String[] args) {
		int num =6;
		long fact =1;
		int i=1;
		while(i<num) {
			fact = fact*i;
			i++;
		}
		System.out.println("factorial of 6 = "+fact);
	}

}
